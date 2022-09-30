package typings.leaflet.global.L

import typings.leaflet.leafletBooleans.`false`
import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSGlobal("L.Util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind(fn: js.Function1[/* repeated */ Any, Unit], obj: Any*): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(scala.List(fn.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function0[Unit]]
  
  inline def cancelAnimFrame(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimFrame")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def create(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Any]
  inline def create(proto: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(proto.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def create(proto: js.Object, properties: PropertyDescriptorMap): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(proto.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def create(proto: Null, properties: PropertyDescriptorMap): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(proto.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSGlobal("L.Util.emptyImageUrl")
  @js.native
  def emptyImageUrl: String = js.native
  inline def emptyImageUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyImageUrl")(x.asInstanceOf[js.Any])
  
  inline def extend(dest: Any, src: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(dest.asInstanceOf[js.Any]).`++`(src.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  inline def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D): D & S1 = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any]).asInstanceOf[D & S1]
  inline def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D, src: S1): D & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[D & S1]
  inline def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */](dest: D, src1: S1, src2: S2): D & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2]
  inline def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */, S3 /* <: js.Object */](dest: D, src1: S1, src2: S2, src3: S3): D & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2 & S3]
  
  inline def falseFn(): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("falseFn")().asInstanceOf[`false`]
  
  inline def formatNum(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNum")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def formatNum(num: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNum")(num.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def formatNum_false(num: Double, digits: `false`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNum")(num.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getParamString(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getParamString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getParamString(obj: Any, existingUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParamString")(obj.asInstanceOf[js.Any], existingUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getParamString(obj: Any, existingUrl: String, uppercase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParamString")(obj.asInstanceOf[js.Any], existingUrl.asInstanceOf[js.Any], uppercase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getParamString(obj: Any, existingUrl: Unit, uppercase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getParamString")(obj.asInstanceOf[js.Any], existingUrl.asInstanceOf[js.Any], uppercase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def indexOf(array: js.Array[Any], el: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isArray(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSGlobal("L.Util.lastId")
  @js.native
  def lastId: Double = js.native
  inline def lastId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastId")(x.asInstanceOf[js.Any])
  
  inline def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: Any, immediate: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def requestAnimFrame(fn: js.Function1[/* timestamp */ Double, Unit], context: Unit, immediate: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setOptions(obj: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def splitWords(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitWords")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stamp(obj: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stamp")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def template(str: String, data: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(str.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def throttle(fn: js.Function0[Unit], time: Double, context: Any): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], time.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def trim(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wrapNum(num: Double, range: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapNum")(num.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def wrapNum(num: Double, range: js.Array[Double], includeMax: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapNum")(num.asInstanceOf[js.Any], range.asInstanceOf[js.Any], includeMax.asInstanceOf[js.Any])).asInstanceOf[Double]
}
