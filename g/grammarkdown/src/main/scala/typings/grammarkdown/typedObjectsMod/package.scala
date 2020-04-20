package typings.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typedObjectsMod {
  type TypeOfTypeHint[T /* <: typings.grammarkdown.typedObjectsMod.TypeHint */] = typings.grammarkdown.typedObjectsMod.TypedObject[T] | js.Object | scala.Null | java.lang.String | scala.Double
  type TypeOfTypeObject[T /* <: typings.grammarkdown.typedObjectsMod.TypeObject[
    typings.grammarkdown.typedObjectsMod.TypeHint, 
    typings.grammarkdown.typedObjectsMod.TypeOfTypeHint[typings.grammarkdown.typedObjectsMod.TypeHint]
  ] */] = typings.std.ReturnType[T]
  type TypedObject[T /* <: typings.grammarkdown.typedObjectsMod.StructureHint */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: grammarkdown.grammarkdown/dist/typedObjects.TypeOfTypeObject<T[K]>}
    */ typings.grammarkdown.grammarkdownStrings.TypedObject with org.scalablytyped.runtime.TopLevel[T]
}
