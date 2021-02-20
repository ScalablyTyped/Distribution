package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a Quest Criterion Contribution resource.
  */
@js.native
trait SchemaQuestContribution extends StObject {
  
  /**
    * The formatted value of the contribution as a string. Format depends on
    * the configuration for the associated event definition in the Play Games
    * Developer Console.
    */
  var formattedValue: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#questContribution.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The value of the contribution.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaQuestContribution {
  
  @scala.inline
  def apply(): SchemaQuestContribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestContribution]
  }
  
  @scala.inline
  implicit class SchemaQuestContributionMutableBuilder[Self <: SchemaQuestContribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
