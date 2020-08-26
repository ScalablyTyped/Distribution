package typings.jbinary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jbinary", JSImport.Namespace)
@js.native
class ^ protected () extends jBinary {
  def this(data: js.Array[Double]) = this()
  def this(bufferSize: Double, typeSet: js.Object) = this()
  def this(data: typings.jdataview.mod.^, typeSet: js.Object) = this()
}

@JSImport("jbinary", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def load(source: js.Any): js.Any = js.native
  def load(
    source: js.Any,
    typeSet: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  def load(source: js.Any, typeSet: js.Any): js.Any = js.native
  def load(source: js.Any, typeSet: js.Any, callback: js.Function2[/* error */ String, /* data */ js.Any, _]): js.Any = js.native
  def loadData(source: js.Any): js.Any = js.native
  def loadData(source: js.Any, callback: js.Function2[/* error */ String, /* data */ js.Any, _]): js.Any = js.native
  def saveAs(destination: js.Any): js.Any = js.native
  def saveAs(
    destination: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  def saveAs(destination: js.Any, mimeType: String): js.Any = js.native
  def saveAs(
    destination: js.Any,
    mimeType: String,
    callback: js.Function2[/* error */ String, /* data */ js.Any, _]
  ): js.Any = js.native
  def toURI(): js.Any = js.native
  def toURI(mimeType: String): js.Any = js.native
}

