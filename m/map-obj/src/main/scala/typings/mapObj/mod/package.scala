package typings.mapObj

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Mapper[SourceObjectType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, MappedObjectKeyType /* <: java.lang.String */, MappedObjectValueType] = js.Function3[
    /* sourceKey */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: SourceObjectType[keyof SourceObjectType] */ /* sourceValue */ js.Any, 
    /* source */ SourceObjectType, 
    js.Tuple2[MappedObjectKeyType, MappedObjectValueType]
  ]
}
