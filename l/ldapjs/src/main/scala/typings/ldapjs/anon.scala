package typings.ldapjs

import org.scalablytyped.runtime.StringDictionary
import typings.ldapjs.mod.AttributeJson
import typings.ldapjs.mod.Control
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Any extends StObject {
    
    var any: js.UndefOr[js.Array[String]] = js.undefined
    
    var attribute: String
    
    var `final`: js.UndefOr[String] = js.undefined
    
    var initial: String
  }
  object Any {
    
    @scala.inline
    def apply(attribute: String, initial: String): Any = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[Any]
    }
    
    @scala.inline
    implicit class AnyMutableBuilder[Self <: Any] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAny(value: js.Array[String]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyUndefined: Self = StObject.set(x, "any", js.undefined)
      
      @scala.inline
      def setAnyVarargs(value: String*): Self = StObject.set(x, "any", js.Array(value :_*))
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinal(value: String): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      @scala.inline
      def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attribute extends StObject {
    
    var attribute: String
    
    var value: String | Buffer
  }
  object Attribute {
    
    @scala.inline
    def apply(attribute: String, value: String | Buffer): Attribute = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttributeString extends StObject {
    
    var attribute: String
  }
  object AttributeString {
    
    @scala.inline
    def apply(attribute: String): AttributeString = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeString]
    }
    
    @scala.inline
    implicit class AttributeStringMutableBuilder[Self <: AttributeString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    }
  }
  
  trait DnAttributes extends StObject {
    
    var dnAttributes: js.UndefOr[Boolean] = js.undefined
    
    var matchType: js.UndefOr[String] = js.undefined
    
    var rule: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object DnAttributes {
    
    @scala.inline
    def apply(value: String): DnAttributes = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnAttributes]
    }
    
    @scala.inline
    implicit class DnAttributesMutableBuilder[Self <: DnAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDnAttributes(value: Boolean): Self = StObject.set(x, "dnAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnAttributesUndefined: Self = StObject.set(x, "dnAttributes", js.undefined)
      
      @scala.inline
      def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
      
      @scala.inline
      def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailAfter extends StObject {
    
    var failAfter: js.UndefOr[Double] = js.undefined
    
    var initialDelay: js.UndefOr[Double] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
  }
  object FailAfter {
    
    @scala.inline
    def apply(): FailAfter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailAfter]
    }
    
    @scala.inline
    implicit class FailAfterMutableBuilder[Self <: FailAfter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailAfter(value: Double): Self = StObject.set(x, "failAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailAfterUndefined: Self = StObject.set(x, "failAfter", js.undefined)
      
      @scala.inline
      def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      @scala.inline
      def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
    }
  }
  
  trait Filter extends StObject {
    
    var filter: typings.ldapjs.mod.Filter
  }
  object Filter {
    
    @scala.inline
    def apply(filter: typings.ldapjs.mod.Filter): Filter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: typings.ldapjs.mod.Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filters extends StObject {
    
    var filters: js.Array[typings.ldapjs.mod.Filter]
  }
  object Filters {
    
    @scala.inline
    def apply(filters: js.Array[typings.ldapjs.mod.Filter]): Filters = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filters]
    }
    
    @scala.inline
    implicit class FiltersMutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.ldapjs.mod.Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersVarargs(value: typings.ldapjs.mod.Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    }
  }
  
  /* Inlined ldapjs.ldapjs.LDAPMessageJsonObject & {  objectName :string,   attributes :std.Array<ldapjs.ldapjs.AttributeJson>} */
  trait LDAPMessageJsonObjectobje
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    var attributes: js.Array[AttributeJson]
    
    var controls: js.Array[Control]
    
    var messageID: Double
    
    var objectName: String
    
    var protocolOp: js.UndefOr[String] = js.undefined
  }
  object LDAPMessageJsonObjectobje {
    
    @scala.inline
    def apply(
      attributes: js.Array[AttributeJson],
      controls: js.Array[Control],
      messageID: Double,
      objectName: String
    ): LDAPMessageJsonObjectobje = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LDAPMessageJsonObjectobje]
    }
    
    @scala.inline
    implicit class LDAPMessageJsonObjectobjeMutableBuilder[Self <: LDAPMessageJsonObjectobje] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[AttributeJson]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: AttributeJson*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value :_*))
      
      @scala.inline
      def setMessageID(value: Double): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolOp(value: String): Self = StObject.set(x, "protocolOp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolOpUndefined: Self = StObject.set(x, "protocolOp", js.undefined)
    }
  }
  
  trait PagePause extends StObject {
    
    var pagePause: js.UndefOr[Boolean] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PagePause {
    
    @scala.inline
    def apply(): PagePause = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagePause]
    }
    
    @scala.inline
    implicit class PagePauseMutableBuilder[Self <: PagePause] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPagePause(value: Boolean): Self = StObject.set(x, "pagePause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagePauseUndefined: Self = StObject.set(x, "pagePause", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var attribute: String
    
    var value: String
  }
  object Value {
    
    @scala.inline
    def apply(attribute: String, value: String): Value = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
