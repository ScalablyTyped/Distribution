package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuggestionProto extends StObject {
  
  /**
    * Reference to a help center article concerning this type of suggestion. Always set.
    */
  var helpUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Message, in the user's language, explaining the suggestion, which may contain markup. Always set.
    */
  var longMessage: js.UndefOr[SchemaSafeHtmlProto] = js.undefined
  
  /**
    * Relative importance of a suggestion. Always set.
    */
  var priority: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A somewhat human readable identifier of the source view, if it does not have a resource_name. This is a path within the accessibility hierarchy, an element with resource name; similar to an XPath.
    */
  var pseudoResourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Region within the screenshot that is relevant to this suggestion. Optional.
    */
  var region: js.UndefOr[SchemaRegionProto] = js.undefined
  
  /**
    * Reference to a view element, identified by its resource name, if it has one.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the screen for the suggestion. It is used for getting the corresponding screenshot path. For example, screen_id "1" corresponds to "1.png" file in GCS. Always set.
    */
  var screenId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Relative importance of a suggestion as compared with other suggestions that have the same priority and category. This is a meaningless value that can be used to order suggestions that are in the same category and have the same priority. The larger values have higher priority (i.e., are more important). Optional.
    */
  var secondaryPriority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Concise message, in the user's language, representing the suggestion, which may contain markup. Always set.
    */
  var shortMessage: js.UndefOr[SchemaSafeHtmlProto] = js.undefined
  
  /**
    * General title for the suggestion, in the user's language, without markup. Always set.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaSuggestionProto {
  
  inline def apply(): SchemaSuggestionProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestionProto]
  }
  
  extension [Self <: SchemaSuggestionProto](x: Self) {
    
    inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
    
    inline def setHelpUrlNull: Self = StObject.set(x, "helpUrl", null)
    
    inline def setHelpUrlUndefined: Self = StObject.set(x, "helpUrl", js.undefined)
    
    inline def setLongMessage(value: SchemaSafeHtmlProto): Self = StObject.set(x, "longMessage", value.asInstanceOf[js.Any])
    
    inline def setLongMessageUndefined: Self = StObject.set(x, "longMessage", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setPseudoResourceId(value: String): Self = StObject.set(x, "pseudoResourceId", value.asInstanceOf[js.Any])
    
    inline def setPseudoResourceIdNull: Self = StObject.set(x, "pseudoResourceId", null)
    
    inline def setPseudoResourceIdUndefined: Self = StObject.set(x, "pseudoResourceId", js.undefined)
    
    inline def setRegion(value: SchemaRegionProto): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    inline def setScreenIdNull: Self = StObject.set(x, "screenId", null)
    
    inline def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
    
    inline def setSecondaryPriority(value: Double): Self = StObject.set(x, "secondaryPriority", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPriorityNull: Self = StObject.set(x, "secondaryPriority", null)
    
    inline def setSecondaryPriorityUndefined: Self = StObject.set(x, "secondaryPriority", js.undefined)
    
    inline def setShortMessage(value: SchemaSafeHtmlProto): Self = StObject.set(x, "shortMessage", value.asInstanceOf[js.Any])
    
    inline def setShortMessageUndefined: Self = StObject.set(x, "shortMessage", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
