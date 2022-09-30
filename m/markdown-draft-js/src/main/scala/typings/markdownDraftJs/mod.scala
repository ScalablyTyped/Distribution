package typings.markdownDraftJs

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import typings.markdownDraftJs.anon.Close
import typings.markdownDraftJs.anon.Open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("markdown-draft-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def draftToMarkdown(RawDraft: RawDraftContentState): String = ^.asInstanceOf[js.Dynamic].applyDynamic("draftToMarkdown")(RawDraft.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def draftToMarkdown(RawDraft: RawDraftContentState, options: DraftToMarkdownOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("draftToMarkdown")(RawDraft.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def markdownToDraft(markdown: String): RawDraftContentState = ^.asInstanceOf[js.Dynamic].applyDynamic("markdownToDraft")(markdown.asInstanceOf[js.Any]).asInstanceOf[RawDraftContentState]
  inline def markdownToDraft(markdown: String, options: MarkdownToDraftOptions): RawDraftContentState = (^.asInstanceOf[js.Dynamic].applyDynamic("markdownToDraft")(markdown.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RawDraftContentState]
  
  type BlockEntitiesParam = StringDictionary[
    js.Function1[
      /* item */ js.UndefOr[StringDictionary[Any]], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any
    ]
  ]
  
  type BlockTypesParam = StringDictionary[
    js.Function1[/* item */ js.UndefOr[StringDictionary[Any]], StringDictionary[Any]]
  ]
  
  trait DraftToMarkdownOptions extends StObject {
    
    var entityItems: js.UndefOr[StringDictionary[Close]] = js.undefined
    
    var escapeMarkdownCharacters: js.UndefOr[Boolean] = js.undefined
    
    var preserveNewlines: js.UndefOr[Boolean] = js.undefined
    
    var styleItems: js.UndefOr[StringDictionary[Open]] = js.undefined
  }
  object DraftToMarkdownOptions {
    
    inline def apply(): DraftToMarkdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraftToMarkdownOptions]
    }
    
    extension [Self <: DraftToMarkdownOptions](x: Self) {
      
      inline def setEntityItems(value: StringDictionary[Close]): Self = StObject.set(x, "entityItems", value.asInstanceOf[js.Any])
      
      inline def setEntityItemsUndefined: Self = StObject.set(x, "entityItems", js.undefined)
      
      inline def setEscapeMarkdownCharacters(value: Boolean): Self = StObject.set(x, "escapeMarkdownCharacters", value.asInstanceOf[js.Any])
      
      inline def setEscapeMarkdownCharactersUndefined: Self = StObject.set(x, "escapeMarkdownCharacters", js.undefined)
      
      inline def setPreserveNewlines(value: Boolean): Self = StObject.set(x, "preserveNewlines", value.asInstanceOf[js.Any])
      
      inline def setPreserveNewlinesUndefined: Self = StObject.set(x, "preserveNewlines", js.undefined)
      
      inline def setStyleItems(value: StringDictionary[Open]): Self = StObject.set(x, "styleItems", value.asInstanceOf[js.Any])
      
      inline def setStyleItemsUndefined: Self = StObject.set(x, "styleItems", js.undefined)
    }
  }
  
  trait MarkdownToDraftOptions extends StObject {
    
    var blockEntities: js.UndefOr[BlockEntitiesParam] = js.undefined
    
    var blockStyles: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var blockTypes: js.UndefOr[BlockTypesParam] = js.undefined
    
    var preserveNewlines: js.UndefOr[Boolean] = js.undefined
    
    var remarkableOptions: js.UndefOr[StringDictionary[Boolean | js.Object]] = js.undefined
    
    var remarkablePlugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    var remarkablePreset: js.UndefOr[String] = js.undefined
  }
  object MarkdownToDraftOptions {
    
    inline def apply(): MarkdownToDraftOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkdownToDraftOptions]
    }
    
    extension [Self <: MarkdownToDraftOptions](x: Self) {
      
      inline def setBlockEntities(value: BlockEntitiesParam): Self = StObject.set(x, "blockEntities", value.asInstanceOf[js.Any])
      
      inline def setBlockEntitiesUndefined: Self = StObject.set(x, "blockEntities", js.undefined)
      
      inline def setBlockStyles(value: StringDictionary[String]): Self = StObject.set(x, "blockStyles", value.asInstanceOf[js.Any])
      
      inline def setBlockStylesUndefined: Self = StObject.set(x, "blockStyles", js.undefined)
      
      inline def setBlockTypes(value: BlockTypesParam): Self = StObject.set(x, "blockTypes", value.asInstanceOf[js.Any])
      
      inline def setBlockTypesUndefined: Self = StObject.set(x, "blockTypes", js.undefined)
      
      inline def setPreserveNewlines(value: Boolean): Self = StObject.set(x, "preserveNewlines", value.asInstanceOf[js.Any])
      
      inline def setPreserveNewlinesUndefined: Self = StObject.set(x, "preserveNewlines", js.undefined)
      
      inline def setRemarkableOptions(value: StringDictionary[Boolean | js.Object]): Self = StObject.set(x, "remarkableOptions", value.asInstanceOf[js.Any])
      
      inline def setRemarkableOptionsUndefined: Self = StObject.set(x, "remarkableOptions", js.undefined)
      
      inline def setRemarkablePlugins(value: js.Array[Any]): Self = StObject.set(x, "remarkablePlugins", value.asInstanceOf[js.Any])
      
      inline def setRemarkablePluginsUndefined: Self = StObject.set(x, "remarkablePlugins", js.undefined)
      
      inline def setRemarkablePluginsVarargs(value: Any*): Self = StObject.set(x, "remarkablePlugins", js.Array(value*))
      
      inline def setRemarkablePreset(value: String): Self = StObject.set(x, "remarkablePreset", value.asInstanceOf[js.Any])
      
      inline def setRemarkablePresetUndefined: Self = StObject.set(x, "remarkablePreset", js.undefined)
    }
  }
}
