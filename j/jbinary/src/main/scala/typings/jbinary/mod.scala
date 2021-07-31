package typings.jbinary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jbinary", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with jBinary {
    def this(data: js.Array[Double]) = this()
    def this(bufferSize: Double, typeSet: js.Object) = this()
    def this(data: typings.jdataview.mod.^, typeSet: js.Object) = this()
  }
  @JSImport("jbinary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def load(source: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def load(source: js.Any, typeSet: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any], typeSet.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def load(
    source: js.Any,
    typeSet: js.Any,
    callback: js.Function2[/* error */ String, /* data */ js.Any, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any], typeSet.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def load(
    source: js.Any,
    typeSet: Unit,
    callback: js.Function2[/* error */ String, /* data */ js.Any, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(source.asInstanceOf[js.Any], typeSet.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def loadData(source: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadData")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def loadData(source: js.Any, callback: js.Function2[/* error */ String, /* data */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("loadData")(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def saveAs(destination: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(destination.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def saveAs(destination: js.Any, mimeType: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(destination.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def saveAs(
    destination: js.Any,
    mimeType: String,
    callback: js.Function2[/* error */ String, /* data */ js.Any, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(destination.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def saveAs(
    destination: js.Any,
    mimeType: Unit,
    callback: js.Function2[/* error */ String, /* data */ js.Any, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(destination.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def toURI(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toURI")().asInstanceOf[js.Any]
  @scala.inline
  def toURI(mimeType: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toURI")(mimeType.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @js.native
  trait jBinary extends StObject {
    
    def as(typeSet: js.Object): jBinary = js.native
    def as(typeSet: js.Object, modifyOriginal: Boolean): jBinary = js.native
    
    def read(`type`: String): js.Any = js.native
    def read(`type`: String, offset: Double): js.Any = js.native
    
    def readAll(): js.Any = js.native
    
    def seek(position: Double): Double = js.native
    def seek(position: Double, callback: js.Function2[/* prop */ this.type, /* data */ js.Any, js.Any]): Double = js.native
    
    def skip(count: Double): Double = js.native
    def skip(count: Double, callback: js.Function2[/* prop */ this.type, /* data */ js.Any, js.Any]): Double = js.native
    
    def slice(start: Double, end: Double): jBinary = js.native
    def slice(start: Double, end: Double, forceCopy: Boolean): jBinary = js.native
    
    def tell(): Double = js.native
    
    def write(`type`: String, data: js.Any): Double = js.native
    def write(`type`: String, data: js.Any, offset: Double): Double = js.native
    
    def writeAll(data: js.Any): Double = js.native
  }
}
