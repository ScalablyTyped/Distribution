package typings.materializeCss.mod

import typings.materializeCss.anon.PartialAutocompleteOption
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Autocomplete")
@js.native
class Autocomplete ()
  extends typings.materializeCss.M.Autocomplete
/* static members */
@JSImport("materialize-css", "Autocomplete")
@js.native
object Autocomplete extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Autocomplete = js.native
  
  /**
    * Init autocompletes
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Autocomplete] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialAutocompleteOption
  ): js.Array[typings.materializeCss.M.Autocomplete] = js.native
  /**
    * Init autocomplete
    */
  def init(els: Element): typings.materializeCss.M.Autocomplete = js.native
  def init(els: Element, options: PartialAutocompleteOption): typings.materializeCss.M.Autocomplete = js.native
}
