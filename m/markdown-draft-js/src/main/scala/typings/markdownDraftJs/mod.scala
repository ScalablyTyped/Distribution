package typings.markdownDraftJs

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import typings.markdownDraftJs.anon.Close
import typings.markdownDraftJs.anon.Open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("markdown-draft-js", "draftToMarkdown")
  @js.native
  def draftToMarkdown(RawDraft: RawDraftContentState): String = js.native
  @JSImport("markdown-draft-js", "draftToMarkdown")
  @js.native
  def draftToMarkdown(RawDraft: RawDraftContentState, options: DraftToMarkdownOptions): String = js.native
  
  @JSImport("markdown-draft-js", "markdownToDraft")
  @js.native
  def markdownToDraft(markdown: String): RawDraftContentState = js.native
  @JSImport("markdown-draft-js", "markdownToDraft")
  @js.native
  def markdownToDraft(markdown: String, options: MarkdownToDraftOptions): RawDraftContentState = js.native
  
  type BlockEntitiesParam = StringDictionary[
    js.Function1[
      /* item */ js.UndefOr[StringDictionary[js.Any]], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ js.Any
    ]
  ]
  
  type BlockTypesParam = StringDictionary[
    js.Function1[/* item */ js.UndefOr[StringDictionary[js.Any]], StringDictionary[js.Any]]
  ]
  
  @js.native
  trait DraftToMarkdownOptions extends StObject {
    
    var entityItems: js.UndefOr[StringDictionary[Close]] = js.native
    
    var preserveNewlines: js.UndefOr[Boolean] = js.native
    
    var styleItems: js.UndefOr[StringDictionary[Open]] = js.native
  }
  object DraftToMarkdownOptions {
    
    @scala.inline
    def apply(): DraftToMarkdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraftToMarkdownOptions]
    }
    
    @scala.inline
    implicit class DraftToMarkdownOptionsMutableBuilder[Self <: DraftToMarkdownOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntityItems(value: StringDictionary[Close]): Self = StObject.set(x, "entityItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityItemsUndefined: Self = StObject.set(x, "entityItems", js.undefined)
      
      @scala.inline
      def setPreserveNewlines(value: Boolean): Self = StObject.set(x, "preserveNewlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveNewlinesUndefined: Self = StObject.set(x, "preserveNewlines", js.undefined)
      
      @scala.inline
      def setStyleItems(value: StringDictionary[Open]): Self = StObject.set(x, "styleItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleItemsUndefined: Self = StObject.set(x, "styleItems", js.undefined)
    }
  }
  
  @js.native
  trait MarkdownToDraftOptions extends StObject {
    
    var blockEntities: js.UndefOr[BlockEntitiesParam] = js.native
    
    var blockStyles: js.UndefOr[StringDictionary[String]] = js.native
    
    var blockTypes: js.UndefOr[BlockTypesParam] = js.native
    
    var preserveNewlines: js.UndefOr[Boolean] = js.native
    
    var remarkableOptions: js.UndefOr[StringDictionary[Boolean | js.Object]] = js.native
    
    var remarkablePlugins: js.UndefOr[js.Array[_]] = js.native
    
    var remarkablePreset: js.UndefOr[String] = js.native
  }
  object MarkdownToDraftOptions {
    
    @scala.inline
    def apply(): MarkdownToDraftOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkdownToDraftOptions]
    }
    
    @scala.inline
    implicit class MarkdownToDraftOptionsMutableBuilder[Self <: MarkdownToDraftOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockEntities(value: BlockEntitiesParam): Self = StObject.set(x, "blockEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockEntitiesUndefined: Self = StObject.set(x, "blockEntities", js.undefined)
      
      @scala.inline
      def setBlockStyles(value: StringDictionary[String]): Self = StObject.set(x, "blockStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockStylesUndefined: Self = StObject.set(x, "blockStyles", js.undefined)
      
      @scala.inline
      def setBlockTypes(value: BlockTypesParam): Self = StObject.set(x, "blockTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockTypesUndefined: Self = StObject.set(x, "blockTypes", js.undefined)
      
      @scala.inline
      def setPreserveNewlines(value: Boolean): Self = StObject.set(x, "preserveNewlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveNewlinesUndefined: Self = StObject.set(x, "preserveNewlines", js.undefined)
      
      @scala.inline
      def setRemarkableOptions(value: StringDictionary[Boolean | js.Object]): Self = StObject.set(x, "remarkableOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemarkableOptionsUndefined: Self = StObject.set(x, "remarkableOptions", js.undefined)
      
      @scala.inline
      def setRemarkablePlugins(value: js.Array[_]): Self = StObject.set(x, "remarkablePlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemarkablePluginsUndefined: Self = StObject.set(x, "remarkablePlugins", js.undefined)
      
      @scala.inline
      def setRemarkablePluginsVarargs(value: js.Any*): Self = StObject.set(x, "remarkablePlugins", js.Array(value :_*))
      
      @scala.inline
      def setRemarkablePreset(value: String): Self = StObject.set(x, "remarkablePreset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemarkablePresetUndefined: Self = StObject.set(x, "remarkablePreset", js.undefined)
    }
  }
}
