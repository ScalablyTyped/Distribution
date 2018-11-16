package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Util")
@js.native
object UtilNs extends js.Object {
  var emptyImageUrl: java.lang.String = js.native
  var lastId: scala.Double = js.native
  def bind(fn: js.Function0[scala.Unit], obj: js.Any*): js.Function0[scala.Unit] = js.native
  def cancelAnimFrame(id: scala.Double): scala.Unit = js.native
  def create(): js.Any = js.native
  def create(proto: js.Object): js.Any = js.native
  def create(proto: js.Object, properties: stdLib.PropertyDescriptorMap): js.Any = js.native
  def create(proto: scala.Null, properties: stdLib.PropertyDescriptorMap): js.Any = js.native
  def extend(dest: js.Any, src: js.Any*): js.Any = js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D): D with S1 = js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D, src: S1): D with S1 = js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */](dest: D, src1: S1, src2: S2): D with S1 with S2 = js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */, S3 /* <: js.Object */](dest: D, src1: S1, src2: S2, src3: S3): D with S1 with S2 with S3 = js.native
  def falseFn(): leafletLib.leafletLibNumbers.`false` = js.native
  def formatNum(num: scala.Double): scala.Double = js.native
  def formatNum(num: scala.Double, digits: scala.Double): scala.Double = js.native
  def getParamString(obj: js.Any): java.lang.String = js.native
  def getParamString(obj: js.Any, existingUrl: java.lang.String): java.lang.String = js.native
  def getParamString(obj: js.Any, existingUrl: java.lang.String, uppercase: scala.Boolean): java.lang.String = js.native
  def indexOf(array: js.Array[_], el: js.Any): scala.Double = js.native
  def isArray(obj: js.Any): scala.Boolean = js.native
  def requestAnimFrame(fn: js.Function1[/* timestamp */ scala.Double, scala.Unit]): scala.Double = js.native
  def requestAnimFrame(fn: js.Function1[/* timestamp */ scala.Double, scala.Unit], context: js.Any): scala.Double = js.native
  def requestAnimFrame(
    fn: js.Function1[/* timestamp */ scala.Double, scala.Unit],
    context: js.Any,
    immediate: scala.Boolean
  ): scala.Double = js.native
  def setOptions(obj: js.Any, options: js.Any): js.Any = js.native
  def splitWords(str: java.lang.String): js.Array[java.lang.String] = js.native
  def stamp(obj: js.Any): scala.Double = js.native
  def template(str: java.lang.String, data: js.Any): java.lang.String = js.native
  def throttle(fn: js.Function0[scala.Unit], time: scala.Double, context: js.Any): js.Function0[scala.Unit] = js.native
  def trim(str: java.lang.String): java.lang.String = js.native
  def wrapNum(num: scala.Double, range: js.Array[scala.Double]): scala.Double = js.native
  def wrapNum(num: scala.Double, range: js.Array[scala.Double], includeMax: scala.Boolean): scala.Double = js.native
}

