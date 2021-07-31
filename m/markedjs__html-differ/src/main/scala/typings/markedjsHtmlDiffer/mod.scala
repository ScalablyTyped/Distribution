package typings.markedjsHtmlDiffer

import typings.markedjsHtmlDiffer.markedjsHtmlDifferStrings.bem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@markedjs/html-differ", "HtmlDiffer")
  @js.native
  class HtmlDiffer () extends StObject {
    def this(options: Options) = this()
    def this(preset: CustomPreset) = this()
    def this(preset: Preset) = this()
    
    def diffHtml(html1: String, html2: String): js.Array[ChangeObject] = js.native
    
    def isEqual(html1: String, html2: String): Boolean = js.native
  }
  
  trait ChangeObject extends StObject {
    
    /** True if the value was inserted into the new string */
    val added: js.UndefOr[Boolean] = js.undefined
    
    /** True if the value was removed from the old string */
    val removed: js.UndefOr[Boolean] = js.undefined
    
    /** Text content */
    val value: js.UndefOr[String] = js.undefined
  }
  object ChangeObject {
    
    @scala.inline
    def apply(): ChangeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeObject]
    }
    
    @scala.inline
    implicit class ChangeObjectMutableBuilder[Self <: ChangeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: Boolean): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      @scala.inline
      def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CustomPreset
    extends StObject
       with Options {
    
    var preset: Preset
  }
  object CustomPreset {
    
    @scala.inline
    def apply(preset: Preset): CustomPreset = {
      val __obj = js.Dynamic.literal(preset = preset.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomPreset]
    }
    
    @scala.inline
    implicit class CustomPresetMutableBuilder[Self <: CustomPreset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreset(value: Preset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Sets what kind of respective attributes' content will be compared as JSON objects, but not as strings.
      * In cases when the value of the attribute is an invalid JSON or can not be wrapped into a function, it will be compared as undefined.
      * @default []
      */
    var compareAttributesAsJSON: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Sets what kind of respective attributes' content will be ignored during the comparison:
      * @default []
      */
    var ignoreAttributes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Makes html-differ ignore HTML comments during the comparison.
      * @default true
      */
    var ignoreComments: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Makes html-differ ignore tags' duplicate attributes during the comparison.
      * From the list of the same tag's attributes,
      * the attribute which goes the first will be taken for comparison, others will be ignored
      * @default false
      */
    var ignoreDuplicateAttributes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Makes html-differ ignore end tags during the comparison.
      * @default false
      */
    var ignoreEndTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Makes html-differ ignore whitespaces (spaces, tabs, new lines etc.) during the comparison.
      * @default true
      */
    var ignoreWhitespaces: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompareAttributesAsJSON(value: js.Array[js.Any]): Self = StObject.set(x, "compareAttributesAsJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompareAttributesAsJSONUndefined: Self = StObject.set(x, "compareAttributesAsJSON", js.undefined)
      
      @scala.inline
      def setCompareAttributesAsJSONVarargs(value: js.Any*): Self = StObject.set(x, "compareAttributesAsJSON", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreAttributes(value: js.Array[String]): Self = StObject.set(x, "ignoreAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAttributesUndefined: Self = StObject.set(x, "ignoreAttributes", js.undefined)
      
      @scala.inline
      def setIgnoreAttributesVarargs(value: String*): Self = StObject.set(x, "ignoreAttributes", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreComments(value: Boolean): Self = StObject.set(x, "ignoreComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCommentsUndefined: Self = StObject.set(x, "ignoreComments", js.undefined)
      
      @scala.inline
      def setIgnoreDuplicateAttributes(value: Boolean): Self = StObject.set(x, "ignoreDuplicateAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDuplicateAttributesUndefined: Self = StObject.set(x, "ignoreDuplicateAttributes", js.undefined)
      
      @scala.inline
      def setIgnoreEndTags(value: Boolean): Self = StObject.set(x, "ignoreEndTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreEndTagsUndefined: Self = StObject.set(x, "ignoreEndTags", js.undefined)
      
      @scala.inline
      def setIgnoreWhitespaces(value: Boolean): Self = StObject.set(x, "ignoreWhitespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreWhitespacesUndefined: Self = StObject.set(x, "ignoreWhitespaces", js.undefined)
    }
  }
  
  type Preset = bem | String
}
