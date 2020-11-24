package typings.jsonSchemaFaker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{[ option in json-schema-faker.json-schema-faker.jsfOptions ]: any}> */
@js.native
trait OptionInputObject extends js.Object {
  
  var alwaysFakeOptionals: js.UndefOr[js.Any] = js.native
  
  var defaultInvalidTypeProduct: js.UndefOr[js.Any] = js.native
  
  var defaultRandExpMax: js.UndefOr[js.Any] = js.native
  
  var failOnInvalidFormat: js.UndefOr[js.Any] = js.native
  
  var failOnInvalidTypes: js.UndefOr[js.Any] = js.native
  
  var fillProperties: js.UndefOr[js.Any] = js.native
  
  var fixedProbabilities: js.UndefOr[js.Any] = js.native
  
  var ignoreMissingRefs: js.UndefOr[js.Any] = js.native
  
  var ignoreProperties: js.UndefOr[js.Any] = js.native
  
  var maxItems: js.UndefOr[js.Any] = js.native
  
  var maxLength: js.UndefOr[js.Any] = js.native
  
  var minItems: js.UndefOr[js.Any] = js.native
  
  var minLength: js.UndefOr[js.Any] = js.native
  
  var optionalsProbability: js.UndefOr[js.Any] = js.native
  
  var random: js.UndefOr[js.Any] = js.native
  
  var refDepthMax: js.UndefOr[js.Any] = js.native
  
  var refDepthMin: js.UndefOr[js.Any] = js.native
  
  var replaceEmptyByRandomValue: js.UndefOr[js.Any] = js.native
  
  var requiredOnly: js.UndefOr[js.Any] = js.native
  
  var resolveJsonPath: js.UndefOr[js.Any] = js.native
  
  var reuseProperties: js.UndefOr[js.Any] = js.native
  
  var useDefaultValue: js.UndefOr[js.Any] = js.native
  
  var useExamplesValue: js.UndefOr[js.Any] = js.native
}
object OptionInputObject {
  
  @scala.inline
  def apply(): OptionInputObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionInputObject]
  }
  
  @scala.inline
  implicit class OptionInputObjectOps[Self <: OptionInputObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlwaysFakeOptionals(value: js.Any): Self = this.set("alwaysFakeOptionals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysFakeOptionals: Self = this.set("alwaysFakeOptionals", js.undefined)
    
    @scala.inline
    def setDefaultInvalidTypeProduct(value: js.Any): Self = this.set("defaultInvalidTypeProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultInvalidTypeProduct: Self = this.set("defaultInvalidTypeProduct", js.undefined)
    
    @scala.inline
    def setDefaultRandExpMax(value: js.Any): Self = this.set("defaultRandExpMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRandExpMax: Self = this.set("defaultRandExpMax", js.undefined)
    
    @scala.inline
    def setFailOnInvalidFormat(value: js.Any): Self = this.set("failOnInvalidFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnInvalidFormat: Self = this.set("failOnInvalidFormat", js.undefined)
    
    @scala.inline
    def setFailOnInvalidTypes(value: js.Any): Self = this.set("failOnInvalidTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnInvalidTypes: Self = this.set("failOnInvalidTypes", js.undefined)
    
    @scala.inline
    def setFillProperties(value: js.Any): Self = this.set("fillProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillProperties: Self = this.set("fillProperties", js.undefined)
    
    @scala.inline
    def setFixedProbabilities(value: js.Any): Self = this.set("fixedProbabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedProbabilities: Self = this.set("fixedProbabilities", js.undefined)
    
    @scala.inline
    def setIgnoreMissingRefs(value: js.Any): Self = this.set("ignoreMissingRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreMissingRefs: Self = this.set("ignoreMissingRefs", js.undefined)
    
    @scala.inline
    def setIgnoreProperties(value: js.Any): Self = this.set("ignoreProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreProperties: Self = this.set("ignoreProperties", js.undefined)
    
    @scala.inline
    def setMaxItems(value: js.Any): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    
    @scala.inline
    def setMaxLength(value: js.Any): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMinItems(value: js.Any): Self = this.set("minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
    
    @scala.inline
    def setMinLength(value: js.Any): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setOptionalsProbability(value: js.Any): Self = this.set("optionalsProbability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalsProbability: Self = this.set("optionalsProbability", js.undefined)
    
    @scala.inline
    def setRandom(value: js.Any): Self = this.set("random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    
    @scala.inline
    def setRefDepthMax(value: js.Any): Self = this.set("refDepthMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefDepthMax: Self = this.set("refDepthMax", js.undefined)
    
    @scala.inline
    def setRefDepthMin(value: js.Any): Self = this.set("refDepthMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefDepthMin: Self = this.set("refDepthMin", js.undefined)
    
    @scala.inline
    def setReplaceEmptyByRandomValue(value: js.Any): Self = this.set("replaceEmptyByRandomValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceEmptyByRandomValue: Self = this.set("replaceEmptyByRandomValue", js.undefined)
    
    @scala.inline
    def setRequiredOnly(value: js.Any): Self = this.set("requiredOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredOnly: Self = this.set("requiredOnly", js.undefined)
    
    @scala.inline
    def setResolveJsonPath(value: js.Any): Self = this.set("resolveJsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveJsonPath: Self = this.set("resolveJsonPath", js.undefined)
    
    @scala.inline
    def setReuseProperties(value: js.Any): Self = this.set("reuseProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReuseProperties: Self = this.set("reuseProperties", js.undefined)
    
    @scala.inline
    def setUseDefaultValue(value: js.Any): Self = this.set("useDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefaultValue: Self = this.set("useDefaultValue", js.undefined)
    
    @scala.inline
    def setUseExamplesValue(value: js.Any): Self = this.set("useExamplesValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExamplesValue: Self = this.set("useExamplesValue", js.undefined)
  }
}
