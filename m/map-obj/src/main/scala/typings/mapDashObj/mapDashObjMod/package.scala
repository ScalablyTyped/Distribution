package typings.mapDashObj

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapDashObjMod {
  import org.scalablytyped.runtime.StringDictionary

  type Mapper[SourceObjectType /* <: StringDictionary[js.Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType] = js.Function3[
    /* sourceKey */ String, 
    /* import warning: ImportType.apply Failed type conversion: SourceObjectType[keyof SourceObjectType] */ /* sourceValue */ js.Any, 
    /* source */ SourceObjectType, 
    js.Tuple2[MappedObjectKeyType, MappedObjectValueType]
  ]
}
