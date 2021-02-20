package typings.jbinary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jbinary", JSImport.Namespace)
  @js.native
  class ^ protected () extends jBinary {
    def this(data: js.Array[Double]) = this()
    def this(bufferSize: Double, typeSet: js.Object) = this()
    def this(data: typings.jdataview.mod.^, typeSet: js.Object) = this()
  }
  
  /* static member */
  @JSImport("jbinary", "load")
  @js.native
  def load(source: js.Any): js.Any = js.native
  @JSImport("jbinary", "load")
  @js.native
  def load(
    source: js.Any,
    typeSet: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  @JSImport("jbinary", "load")
  @js.native
  def load(source: js.Any, typeSet: js.Any): js.Any = js.native
  @JSImport("jbinary", "load")
  @js.native
  def load(source: js.Any, typeSet: js.Any, callback: js.Function2[/* error */ String, /* data */ js.Any, _]): js.Any = js.native
  
  /* static member */
  @JSImport("jbinary", "loadData")
  @js.native
  def loadData(source: js.Any): js.Any = js.native
  @JSImport("jbinary", "loadData")
  @js.native
  def loadData(source: js.Any, callback: js.Function2[/* error */ String, /* data */ js.Any, _]): js.Any = js.native
  
  /* static member */
  @JSImport("jbinary", "saveAs")
  @js.native
  def saveAs(destination: js.Any): js.Any = js.native
  @JSImport("jbinary", "saveAs")
  @js.native
  def saveAs(
    destination: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  @JSImport("jbinary", "saveAs")
  @js.native
  def saveAs(destination: js.Any, mimeType: String): js.Any = js.native
  @JSImport("jbinary", "saveAs")
  @js.native
  def saveAs(
    destination: js.Any,
    mimeType: String,
    callback: js.Function2[/* error */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  
  /* static member */
  @JSImport("jbinary", "toURI")
  @js.native
  def toURI(): js.Any = js.native
  @JSImport("jbinary", "toURI")
  @js.native
  def toURI(mimeType: String): js.Any = js.native
  
  @js.native
  trait jBinary extends StObject {
    
    def as(typeSet: js.Object): jBinary = js.native
    def as(typeSet: js.Object, modifyOriginal: Boolean): jBinary = js.native
    
    def read(`type`: String): js.Any = js.native
    def read(`type`: String, offset: Double): js.Any = js.native
    
    def readAll(): js.Any = js.native
    
    def seek(position: Double): Double = js.native
    def seek(position: Double, callback: js.Function2[/* prop */ this.type, /* data */ js.Any, _]): Double = js.native
    
    def skip(count: Double): Double = js.native
    def skip(count: Double, callback: js.Function2[/* prop */ this.type, /* data */ js.Any, _]): Double = js.native
    
    def slice(start: Double, end: Double): jBinary = js.native
    def slice(start: Double, end: Double, forceCopy: Boolean): jBinary = js.native
    
    def tell(): Double = js.native
    
    def write(`type`: String, data: js.Any): Double = js.native
    def write(`type`: String, data: js.Any, offset: Double): Double = js.native
    
    def writeAll(data: js.Any): Double = js.native
  }
}
