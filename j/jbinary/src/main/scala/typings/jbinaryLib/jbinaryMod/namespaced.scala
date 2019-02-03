package typings
package jbinaryLib.jbinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jbinary", JSImport.Namespace)
@js.native
class namespaced protected () extends jBinary {
  def this(data: js.Array[scala.Double]) = this()
  def this(bufferSize: scala.Double, typeSet: js.Object) = this()
  def this(data: jdataviewLib.jdataviewMod.namespaced, typeSet: js.Object) = this()
}

/* static members */
@JSImport("jbinary", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def load(source: js.Any): js.Any = js.native
  def load(source: js.Any, typeSet: js.Any): js.Any = js.native
  def load(
    source: js.Any,
    typeSet: js.Any,
    callback: js.Function2[/* error */ java.lang.String, /* data */ js.Any, _]
  ): js.Any = js.native
  def loadData(source: js.Any): js.Any = js.native
  def loadData(source: js.Any, callback: js.Function2[/* error */ java.lang.String, /* data */ js.Any, _]): js.Any = js.native
  def saveAs(destination: js.Any): js.Any = js.native
  def saveAs(destination: js.Any, mimeType: java.lang.String): js.Any = js.native
  def saveAs(
    destination: js.Any,
    mimeType: java.lang.String,
    callback: js.Function2[/* error */ java.lang.String, /* data */ js.Any, _]
  ): js.Any = js.native
  def toURI(): js.Any = js.native
  def toURI(mimeType: java.lang.String): js.Any = js.native
}

