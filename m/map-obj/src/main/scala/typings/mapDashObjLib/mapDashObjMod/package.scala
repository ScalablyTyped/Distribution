package typings
package mapDashObjLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapDashObjMod {
  type Mapper[O /* <: js.Object */, T /* <: java.lang.String */, U] = js.Function3[
    /* sourceKey */ java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: O[keyof O] */ /* sourceValue */ js.Any, 
    /* source */ O, 
    js.Tuple2[T, U]
  ]
}
