package typings.leaflet.mod

import typings.leaflet.leafletBooleans.`false`
import typings.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Util")
@js.native
object Util extends js.Object {
  var emptyImageUrl: String = js.native
  var lastId: Double = js.native
  def bind(fn: js.Function0[Unit], obj: js.Any*): js.Function0[Unit] = js.native
  def cancelAnimFrame(id: Double): Unit = js.native
  def create(): js.Any = js.native
  def create(proto: js.Object): js.Any = js.native
  def create(proto: js.Object, properties: PropertyDescriptorMap): js.Any = js.native
  def create(proto: Null, properties: PropertyDescriptorMap): js.Any = js.native
  def extend(dest: js.Any, src: js.Any*): js.Any = js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D): D with S1 = js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D, src: S1): D with S1 = js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */](dest: D, src1: S1, src2: S2): D with S1 with S2 = js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */, S3 /* <: js.Object */](dest: D, src1: S1, src2: S2, src3: S3): D with S1 with S2 with S3 = js.native
  def falseFn(): `false` = js.native
  def formatNum(num: Double): Double = js.native
  def formatNum(num: Double, digits: Double): Double = js.native
  def getParamString(obj: js.Any): String = js.native
  def getParamString(obj: js.Any, existingUrl: String): String = js.native
  def getParamString(obj: js.Any, existingUrl: String, uppercase: Boolean): String = js.native
  def indexOf(array: js.Array[_], el: js.Any): Double = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit]): Double = js.native
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: js.Any): Double = js.native
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: js.Any, immediate: Boolean): Double = js.native
  def setOptions(obj: js.Any, options: js.Any): js.Any = js.native
  def splitWords(str: String): js.Array[String] = js.native
  def stamp(obj: js.Any): Double = js.native
  def template(str: String, data: js.Any): String = js.native
  def throttle(fn: js.Function0[Unit], time: Double, context: js.Any): js.Function0[Unit] = js.native
  def trim(str: String): String = js.native
  def wrapNum(num: Double, range: js.Array[Double]): Double = js.native
  def wrapNum(num: Double, range: js.Array[Double], includeMax: Boolean): Double = js.native
}

