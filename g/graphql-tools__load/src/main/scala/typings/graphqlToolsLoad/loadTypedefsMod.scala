package typings.graphqlToolsLoad

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlToolsLoad.anon.Cache
import typings.graphqlToolsUtils.loadersMod.SingleFileOptions
import typings.graphqlToolsUtils.loadersMod.Source
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/load-typedefs", JSImport.Namespace)
@js.native
object loadTypedefsMod extends js.Object {
  def loadTypedefs[AdditionalConfig](
    pointerOrPointers: js.Array[UnnormalizedTypeDefPointer],
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Promise[js.Array[Source]] = js.native
  def loadTypedefs[AdditionalConfig](
    pointerOrPointers: UnnormalizedTypeDefPointer,
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Promise[js.Array[Source]] = js.native
  def loadTypedefsSync[AdditionalConfig](
    pointerOrPointers: js.Array[UnnormalizedTypeDefPointer],
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Array[Source] = js.native
  def loadTypedefsSync[AdditionalConfig](
    pointerOrPointers: UnnormalizedTypeDefPointer,
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Array[Source] = js.native
  type LoadTypedefsOptions[ExtraConfig] = SingleFileOptions with ExtraConfig with Cache
  type UnnormalizedTypeDefPointer = StringDictionary[js.Any] | String
}

