package typings.istextorbinary

import typings.istextorbinary.istextorbinaryStrings.binary
import typings.istextorbinary.istextorbinaryStrings.utf8
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istextorbinary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getEncoding(buffer: Buffer, opts: Unit, next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getEncoding")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def getEncoding(
    buffer: Buffer,
    opts: Options,
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getEncoding")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getEncodingSync(buffer: Buffer): utf8 | binary = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncodingSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[utf8 | binary]
  @scala.inline
  def getEncodingSync(buffer: Buffer, opts: Options): utf8 | binary = (^.asInstanceOf[js.Dynamic].applyDynamic("getEncodingSync")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[utf8 | binary]
  
  @scala.inline
  def isBinary(filename: String, buffer: Unit, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def isBinary(filename: String, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def isBinary(filename: Unit, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isBinarySync(filename: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinarySync")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isBinarySync(filename: String, buffer: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinarySync")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isBinarySync(filename: Unit, buffer: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinarySync")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isText(filename: String, buffer: Unit, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def isText(filename: String, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def isText(filename: Unit, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isTextSync(filename: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isTextSync(filename: String, buffer: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTextSync")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isTextSync(filename: Unit, buffer: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTextSync")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var chunkBegin: js.UndefOr[Double] = js.undefined
    
    var chunkLength: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkBegin(value: Double): Self = StObject.set(x, "chunkBegin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkBeginUndefined: Self = StObject.set(x, "chunkBegin", js.undefined)
      
      @scala.inline
      def setChunkLength(value: Double): Self = StObject.set(x, "chunkLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkLengthUndefined: Self = StObject.set(x, "chunkLength", js.undefined)
    }
  }
}
