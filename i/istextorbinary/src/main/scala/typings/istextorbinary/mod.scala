package typings.istextorbinary

import typings.istextorbinary.istextorbinaryStrings.binary
import typings.istextorbinary.istextorbinaryStrings.utf8
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istextorbinary", "getEncoding")
  @js.native
  def getEncoding(
    buffer: Buffer,
    opts: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = js.native
  @JSImport("istextorbinary", "getEncoding")
  @js.native
  def getEncoding(
    buffer: Buffer,
    opts: Options,
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = js.native
  
  @JSImport("istextorbinary", "getEncodingSync")
  @js.native
  def getEncodingSync(buffer: Buffer): utf8 | binary = js.native
  @JSImport("istextorbinary", "getEncodingSync")
  @js.native
  def getEncodingSync(buffer: Buffer, opts: Options): utf8 | binary = js.native
  
  @JSImport("istextorbinary", "isBinary")
  @js.native
  def isBinary(
    filename: js.UndefOr[scala.Nothing],
    buffer: Buffer,
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  @JSImport("istextorbinary", "isBinary")
  @js.native
  def isBinary(
    filename: String,
    buffer: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  @JSImport("istextorbinary", "isBinary")
  @js.native
  def isBinary(filename: String, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = js.native
  
  @JSImport("istextorbinary", "isBinarySync")
  @js.native
  def isBinarySync(filename: js.UndefOr[scala.Nothing], buffer: Buffer): Boolean = js.native
  @JSImport("istextorbinary", "isBinarySync")
  @js.native
  def isBinarySync(filename: String): Boolean = js.native
  @JSImport("istextorbinary", "isBinarySync")
  @js.native
  def isBinarySync(filename: String, buffer: Buffer): Boolean = js.native
  
  @JSImport("istextorbinary", "isText")
  @js.native
  def isText(
    filename: js.UndefOr[scala.Nothing],
    buffer: Buffer,
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  @JSImport("istextorbinary", "isText")
  @js.native
  def isText(
    filename: String,
    buffer: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  @JSImport("istextorbinary", "isText")
  @js.native
  def isText(filename: String, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = js.native
  
  @JSImport("istextorbinary", "isTextSync")
  @js.native
  def isTextSync(filename: js.UndefOr[scala.Nothing], buffer: Buffer): Boolean = js.native
  @JSImport("istextorbinary", "isTextSync")
  @js.native
  def isTextSync(filename: String): Boolean = js.native
  @JSImport("istextorbinary", "isTextSync")
  @js.native
  def isTextSync(filename: String, buffer: Buffer): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var chunkBegin: js.UndefOr[Double] = js.native
    
    var chunkLength: js.UndefOr[Double] = js.native
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
