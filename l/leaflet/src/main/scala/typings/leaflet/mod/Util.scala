package typings.leaflet.mod

import typings.leaflet.leafletBooleans.`false`
import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSImport("leaflet", "Util")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bind(fn: js.Function1[/* repeated */ js.Any, Unit], obj: js.Any*): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def cancelAnimFrame(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimFrame")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
  @scala.inline
  def create(proto: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(proto.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def create(proto: js.Object, properties: PropertyDescriptorMap): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(proto.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def create(proto: Null, properties: PropertyDescriptorMap): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(proto.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("leaflet", "Util.emptyImageUrl")
  @js.native
  def emptyImageUrl: String = js.native
  @scala.inline
  def emptyImageUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyImageUrl")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extend(dest: js.Any, src: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D): D & S1 = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any]).asInstanceOf[D & S1]
  @scala.inline
  def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D, src: S1): D & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[D & S1]
  @scala.inline
  def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */](dest: D, src1: S1, src2: S2): D & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2]
  @scala.inline
  def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */, S3 /* <: js.Object */](dest: D, src1: S1, src2: S2, src3: S3): D & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2 & S3]
  
  @scala.inline
  def falseFn(): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("falseFn")().asInstanceOf[`false`]
  
  @scala.inline
  def formatNum(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNum")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def formatNum(num: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNum")(num.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getParamString(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getParamString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getParamString(obj: js.Any, existingUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParamString")(obj.asInstanceOf[js.Any], existingUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getParamString(obj: js.Any, existingUrl: String, uppercase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParamString")(obj.asInstanceOf[js.Any], existingUrl.asInstanceOf[js.Any], uppercase.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getParamString(obj: js.Any, existingUrl: Unit, uppercase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParamString")(obj.asInstanceOf[js.Any], existingUrl.asInstanceOf[js.Any], uppercase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def indexOf(array: js.Array[js.Any], el: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isArray(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("leaflet", "Util.lastId")
  @js.native
  def lastId: Double = js.native
  @scala.inline
  def lastId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastId")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: js.Any, immediate: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: Unit, immediate: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setOptions(obj: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def splitWords(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitWords")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def stamp(obj: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stamp")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def template(str: String, data: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(str.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def throttle(fn: js.Function0[Unit], time: Double, context: js.Any): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], time.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def trim(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def wrapNum(num: Double, range: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapNum")(num.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def wrapNum(num: Double, range: js.Array[Double], includeMax: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapNum")(num.asInstanceOf[js.Any], range.asInstanceOf[js.Any], includeMax.asInstanceOf[js.Any])).asInstanceOf[Double]
}
