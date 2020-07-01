package typings.graphqlToolsUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loadersMod {
  type DocumentGlobPathPointer = java.lang.String
  type DocumentLoader[TOptions /* <: typings.graphqlToolsUtils.loadersMod.SingleFileOptions */] = typings.graphqlToolsUtils.loadersMod.Loader[typings.graphqlToolsUtils.loadersMod.DocumentPointerSingle, TOptions]
  type DocumentPointer = typings.graphqlToolsUtils.loadersMod.WithList[typings.graphqlToolsUtils.loadersMod.DocumentGlobPathPointer]
  type DocumentPointerSingle = typings.graphqlToolsUtils.loadersMod.ElementOf[typings.graphqlToolsUtils.loadersMod.DocumentPointer]
  type ElementOf[TList] = js.Any
  type SchemaLoader[TOptions /* <: typings.graphqlToolsUtils.loadersMod.SingleFileOptions */] = typings.graphqlToolsUtils.loadersMod.Loader[typings.graphqlToolsUtils.loadersMod.SchemaPointerSingle, TOptions]
  type SchemaPointer = typings.graphqlToolsUtils.loadersMod.WithList[java.lang.String]
  type SchemaPointerSingle = typings.graphqlToolsUtils.loadersMod.ElementOf[typings.graphqlToolsUtils.loadersMod.SchemaPointer]
  type UniversalLoader[TOptions /* <: typings.graphqlToolsUtils.loadersMod.SingleFileOptions */] = typings.graphqlToolsUtils.loadersMod.Loader[
    typings.graphqlToolsUtils.loadersMod.SchemaPointerSingle | typings.graphqlToolsUtils.loadersMod.DocumentPointerSingle, 
    TOptions
  ]
  type WithList[T] = T | js.Array[T]
}
