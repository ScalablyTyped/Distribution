package typings.leaflet.mod

import typings.leaflet.leafletBooleans.`false`
import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSImport("leaflet", "Util")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "Util.bind")
  @js.native
  def bind(fn: js.Function1[/* repeated */ js.Any, Unit], obj: js.Any*): js.Function0[Unit] = js.native
  
  @JSImport("leaflet", "Util.cancelAnimFrame")
  @js.native
  def cancelAnimFrame(id: Double): Unit = js.native
  
  @JSImport("leaflet", "Util.create")
  @js.native
  def create(): js.Any = js.native
  @JSImport("leaflet", "Util.create")
  @js.native
  def create(proto: js.Object): js.Any = js.native
  @JSImport("leaflet", "Util.create")
  @js.native
  def create(proto: js.Object, properties: PropertyDescriptorMap): js.Any = js.native
  @JSImport("leaflet", "Util.create")
  @js.native
  def create(proto: Null, properties: PropertyDescriptorMap): js.Any = js.native
  
  @JSImport("leaflet", "Util.emptyImageUrl")
  @js.native
  def emptyImageUrl: String = js.native
  @scala.inline
  def emptyImageUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyImageUrl")(x.asInstanceOf[js.Any])
  
  @JSImport("leaflet", "Util.extend")
  @js.native
  def extend(dest: js.Any, src: js.Any*): js.Any = js.native
  @JSImport("leaflet", "Util.extend")
  @js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D): D with S1 = js.native
  @JSImport("leaflet", "Util.extend")
  @js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D, src: S1): D with S1 = js.native
  @JSImport("leaflet", "Util.extend")
  @js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */](dest: D, src1: S1, src2: S2): D with S1 with S2 = js.native
  @JSImport("leaflet", "Util.extend")
  @js.native
  def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */, S3 /* <: js.Object */](dest: D, src1: S1, src2: S2, src3: S3): D with S1 with S2 with S3 = js.native
  
  @JSImport("leaflet", "Util.falseFn")
  @js.native
  def falseFn(): `false` = js.native
  
  @JSImport("leaflet", "Util.formatNum")
  @js.native
  def formatNum(num: Double): Double = js.native
  @JSImport("leaflet", "Util.formatNum")
  @js.native
  def formatNum(num: Double, digits: Double): Double = js.native
  
  @JSImport("leaflet", "Util.getParamString")
  @js.native
  def getParamString(obj: js.Any): String = js.native
  @JSImport("leaflet", "Util.getParamString")
  @js.native
  def getParamString(obj: js.Any, existingUrl: js.UndefOr[scala.Nothing], uppercase: Boolean): String = js.native
  @JSImport("leaflet", "Util.getParamString")
  @js.native
  def getParamString(obj: js.Any, existingUrl: String): String = js.native
  @JSImport("leaflet", "Util.getParamString")
  @js.native
  def getParamString(obj: js.Any, existingUrl: String, uppercase: Boolean): String = js.native
  
  @JSImport("leaflet", "Util.indexOf")
  @js.native
  def indexOf(array: js.Array[_], el: js.Any): Double = js.native
  
  @JSImport("leaflet", "Util.isArray")
  @js.native
  def isArray(obj: js.Any): Boolean = js.native
  
  @JSImport("leaflet", "Util.lastId")
  @js.native
  def lastId: Double = js.native
  @scala.inline
  def lastId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastId")(x.asInstanceOf[js.Any])
  
  @JSImport("leaflet", "Util.requestAnimFrame")
  @js.native
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit]): Double = js.native
  @JSImport("leaflet", "Util.requestAnimFrame")
  @js.native
  def requestAnimFrame(
    fn: js.Function1[/* timestamp */ Double, Unit],
    context: js.UndefOr[scala.Nothing],
    immediate: Boolean
  ): Double = js.native
  @JSImport("leaflet", "Util.requestAnimFrame")
  @js.native
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: js.Any): Double = js.native
  @JSImport("leaflet", "Util.requestAnimFrame")
  @js.native
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: js.Any, immediate: Boolean): Double = js.native
  
  @JSImport("leaflet", "Util.setOptions")
  @js.native
  def setOptions(obj: js.Any, options: js.Any): js.Any = js.native
  
  @JSImport("leaflet", "Util.splitWords")
  @js.native
  def splitWords(str: String): js.Array[String] = js.native
  
  @JSImport("leaflet", "Util.stamp")
  @js.native
  def stamp(obj: js.Any): Double = js.native
  
  @JSImport("leaflet", "Util.template")
  @js.native
  def template(str: String, data: js.Any): String = js.native
  
  @JSImport("leaflet", "Util.throttle")
  @js.native
  def throttle(fn: js.Function0[Unit], time: Double, context: js.Any): js.Function0[Unit] = js.native
  
  @JSImport("leaflet", "Util.trim")
  @js.native
  def trim(str: String): String = js.native
  
  @JSImport("leaflet", "Util.wrapNum")
  @js.native
  def wrapNum(num: Double, range: js.Array[Double]): Double = js.native
  @JSImport("leaflet", "Util.wrapNum")
  @js.native
  def wrapNum(num: Double, range: js.Array[Double], includeMax: Boolean): Double = js.native
}
