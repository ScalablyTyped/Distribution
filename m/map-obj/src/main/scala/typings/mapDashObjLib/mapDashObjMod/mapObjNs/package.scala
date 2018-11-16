package typings
package mapDashObjLib.mapDashObjMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapObjNs {
  type Mapper[O /* <: js.Object */, T /* <: java.lang.String */, U] = js.Function3[
    /* sourceKey */ java.lang.String, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(O))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(O))),List())))) *//* sourceValue */ js.Any, 
    /* source */ O, 
    js.Tuple2[T, U]
  ]
}
