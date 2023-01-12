package typings.jsoneditor

import typings.jsoneditor.mod.JSONPath
import typings.jsoneditor.mod.SelectionPosition
import typings.jsoneditor.mod.SerializableNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: SerializableNode
    
    var start: SerializableNode
  }
  object End {
    
    inline def apply(end: SerializableNode, start: SerializableNode): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: SerializableNode): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SerializableNode): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: js.Array[String]
    
    var startFrom: Double
  }
  object Options {
    
    inline def apply(options: js.Array[String], startFrom: Double): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], startFrom = startFrom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setStartFrom(value: Double): Self = StObject.set(x, "startFrom", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<jsoneditor.jsoneditor.TranslationKey, string>> */
  trait PartialRecordTranslationK extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var actionsMenu: js.UndefOr[String] = js.undefined
    
    var appendSubmenuTitle: js.UndefOr[String] = js.undefined
    
    var appendText: js.UndefOr[String] = js.undefined
    
    var appendTitle: js.UndefOr[String] = js.undefined
    
    var appendTitleAuto: js.UndefOr[String] = js.undefined
    
    var array: js.UndefOr[String] = js.undefined
    
    var arrayType: js.UndefOr[String] = js.undefined
    
    var ascending: js.UndefOr[String] = js.undefined
    
    var ascendingTitle: js.UndefOr[String] = js.undefined
    
    var auto: js.UndefOr[String] = js.undefined
    
    var autoType: js.UndefOr[String] = js.undefined
    
    var cannotParseFieldError: js.UndefOr[String] = js.undefined
    
    var cannotParseValueError: js.UndefOr[String] = js.undefined
    
    var collapseAll: js.UndefOr[String] = js.undefined
    
    var compactTitle: js.UndefOr[String] = js.undefined
    
    var containsInvalidItems: js.UndefOr[String] = js.undefined
    
    var containsInvalidProperties: js.UndefOr[String] = js.undefined
    
    var descending: js.UndefOr[String] = js.undefined
    
    var descendingTitle: js.UndefOr[String] = js.undefined
    
    var drag: js.UndefOr[String] = js.undefined
    
    var duplicateField: js.UndefOr[String] = js.undefined
    
    var duplicateFieldError: js.UndefOr[String] = js.undefined
    
    var duplicateKey: js.UndefOr[String] = js.undefined
    
    var duplicateText: js.UndefOr[String] = js.undefined
    
    var duplicateTitle: js.UndefOr[String] = js.undefined
    
    var empty: js.UndefOr[String] = js.undefined
    
    var examples: js.UndefOr[String] = js.undefined
    
    var expandAll: js.UndefOr[String] = js.undefined
    
    var expandTitle: js.UndefOr[String] = js.undefined
    
    var extract: js.UndefOr[String] = js.undefined
    
    var extractTitle: js.UndefOr[String] = js.undefined
    
    var formatTitle: js.UndefOr[String] = js.undefined
    
    var insert: js.UndefOr[String] = js.undefined
    
    var insertSub: js.UndefOr[String] = js.undefined
    
    var insertTitle: js.UndefOr[String] = js.undefined
    
    var modeCodeText: js.UndefOr[String] = js.undefined
    
    var modeCodeTitle: js.UndefOr[String] = js.undefined
    
    var modeEditorTitle: js.UndefOr[String] = js.undefined
    
    var modeFormText: js.UndefOr[String] = js.undefined
    
    var modeFormTitle: js.UndefOr[String] = js.undefined
    
    var modePreviewText: js.UndefOr[String] = js.undefined
    
    var modePreviewTitle: js.UndefOr[String] = js.undefined
    
    var modeTextText: js.UndefOr[String] = js.undefined
    
    var modeTextTitle: js.UndefOr[String] = js.undefined
    
    var modeTreeText: js.UndefOr[String] = js.undefined
    
    var modeTreeTitle: js.UndefOr[String] = js.undefined
    
    var modeViewText: js.UndefOr[String] = js.undefined
    
    var modeViewTitle: js.UndefOr[String] = js.undefined
    
    var `object`: js.UndefOr[String] = js.undefined
    
    var objectType: js.UndefOr[String] = js.undefined
    
    var ok: js.UndefOr[String] = js.undefined
    
    var openUrl: js.UndefOr[String] = js.undefined
    
    var redo: js.UndefOr[String] = js.undefined
    
    var removeField: js.UndefOr[String] = js.undefined
    
    var removeText: js.UndefOr[String] = js.undefined
    
    var removeTitle: js.UndefOr[String] = js.undefined
    
    var repairTitle: js.UndefOr[String] = js.undefined
    
    var searchNextResultTitle: js.UndefOr[String] = js.undefined
    
    var searchPreviousResultTitle: js.UndefOr[String] = js.undefined
    
    var searchTitle: js.UndefOr[String] = js.undefined
    
    var selectNode: js.UndefOr[String] = js.undefined
    
    var showAll: js.UndefOr[String] = js.undefined
    
    var showMore: js.UndefOr[String] = js.undefined
    
    var showMoreStatus: js.UndefOr[String] = js.undefined
    
    var sort: js.UndefOr[String] = js.undefined
    
    var sortAscending: js.UndefOr[String] = js.undefined
    
    var sortAscendingTitle: js.UndefOr[String] = js.undefined
    
    var sortDescending: js.UndefOr[String] = js.undefined
    
    var sortDescendingTitle: js.UndefOr[String] = js.undefined
    
    var sortDirectionLabel: js.UndefOr[String] = js.undefined
    
    var sortFieldLabel: js.UndefOr[String] = js.undefined
    
    var sortFieldTitle: js.UndefOr[String] = js.undefined
    
    var sortTitle: js.UndefOr[String] = js.undefined
    
    var sortTitleShort: js.UndefOr[String] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
    
    var stringType: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
    
    var transformPreviewLabel: js.UndefOr[String] = js.undefined
    
    var transformQueryLabel: js.UndefOr[String] = js.undefined
    
    var transformQueryTitle: js.UndefOr[String] = js.undefined
    
    var transformTitle: js.UndefOr[String] = js.undefined
    
    var transformTitleShort: js.UndefOr[String] = js.undefined
    
    var transformWizardFilter: js.UndefOr[String] = js.undefined
    
    var transformWizardLabel: js.UndefOr[String] = js.undefined
    
    var transformWizardSelectFields: js.UndefOr[String] = js.undefined
    
    var transformWizardSortBy: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeTitle: js.UndefOr[String] = js.undefined
    
    var undo: js.UndefOr[String] = js.undefined
    
    var validationCannotMove: js.UndefOr[String] = js.undefined
  }
  object PartialRecordTranslationK {
    
    inline def apply(): PartialRecordTranslationK = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordTranslationK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRecordTranslationK] (val x: Self) extends AnyVal {
      
      inline def setActionsMenu(value: String): Self = StObject.set(x, "actionsMenu", value.asInstanceOf[js.Any])
      
      inline def setActionsMenuUndefined: Self = StObject.set(x, "actionsMenu", js.undefined)
      
      inline def setAppendSubmenuTitle(value: String): Self = StObject.set(x, "appendSubmenuTitle", value.asInstanceOf[js.Any])
      
      inline def setAppendSubmenuTitleUndefined: Self = StObject.set(x, "appendSubmenuTitle", js.undefined)
      
      inline def setAppendText(value: String): Self = StObject.set(x, "appendText", value.asInstanceOf[js.Any])
      
      inline def setAppendTextUndefined: Self = StObject.set(x, "appendText", js.undefined)
      
      inline def setAppendTitle(value: String): Self = StObject.set(x, "appendTitle", value.asInstanceOf[js.Any])
      
      inline def setAppendTitleAuto(value: String): Self = StObject.set(x, "appendTitleAuto", value.asInstanceOf[js.Any])
      
      inline def setAppendTitleAutoUndefined: Self = StObject.set(x, "appendTitleAuto", js.undefined)
      
      inline def setAppendTitleUndefined: Self = StObject.set(x, "appendTitle", js.undefined)
      
      inline def setArray(value: String): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayType(value: String): Self = StObject.set(x, "arrayType", value.asInstanceOf[js.Any])
      
      inline def setArrayTypeUndefined: Self = StObject.set(x, "arrayType", js.undefined)
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setAscending(value: String): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
      
      inline def setAscendingTitle(value: String): Self = StObject.set(x, "ascendingTitle", value.asInstanceOf[js.Any])
      
      inline def setAscendingTitleUndefined: Self = StObject.set(x, "ascendingTitle", js.undefined)
      
      inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
      
      inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoType(value: String): Self = StObject.set(x, "autoType", value.asInstanceOf[js.Any])
      
      inline def setAutoTypeUndefined: Self = StObject.set(x, "autoType", js.undefined)
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setCannotParseFieldError(value: String): Self = StObject.set(x, "cannotParseFieldError", value.asInstanceOf[js.Any])
      
      inline def setCannotParseFieldErrorUndefined: Self = StObject.set(x, "cannotParseFieldError", js.undefined)
      
      inline def setCannotParseValueError(value: String): Self = StObject.set(x, "cannotParseValueError", value.asInstanceOf[js.Any])
      
      inline def setCannotParseValueErrorUndefined: Self = StObject.set(x, "cannotParseValueError", js.undefined)
      
      inline def setCollapseAll(value: String): Self = StObject.set(x, "collapseAll", value.asInstanceOf[js.Any])
      
      inline def setCollapseAllUndefined: Self = StObject.set(x, "collapseAll", js.undefined)
      
      inline def setCompactTitle(value: String): Self = StObject.set(x, "compactTitle", value.asInstanceOf[js.Any])
      
      inline def setCompactTitleUndefined: Self = StObject.set(x, "compactTitle", js.undefined)
      
      inline def setContainsInvalidItems(value: String): Self = StObject.set(x, "containsInvalidItems", value.asInstanceOf[js.Any])
      
      inline def setContainsInvalidItemsUndefined: Self = StObject.set(x, "containsInvalidItems", js.undefined)
      
      inline def setContainsInvalidProperties(value: String): Self = StObject.set(x, "containsInvalidProperties", value.asInstanceOf[js.Any])
      
      inline def setContainsInvalidPropertiesUndefined: Self = StObject.set(x, "containsInvalidProperties", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDescending(value: String): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
      
      inline def setDescendingTitle(value: String): Self = StObject.set(x, "descendingTitle", value.asInstanceOf[js.Any])
      
      inline def setDescendingTitleUndefined: Self = StObject.set(x, "descendingTitle", js.undefined)
      
      inline def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
      
      inline def setDrag(value: String): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setDuplicateField(value: String): Self = StObject.set(x, "duplicateField", value.asInstanceOf[js.Any])
      
      inline def setDuplicateFieldError(value: String): Self = StObject.set(x, "duplicateFieldError", value.asInstanceOf[js.Any])
      
      inline def setDuplicateFieldErrorUndefined: Self = StObject.set(x, "duplicateFieldError", js.undefined)
      
      inline def setDuplicateFieldUndefined: Self = StObject.set(x, "duplicateField", js.undefined)
      
      inline def setDuplicateKey(value: String): Self = StObject.set(x, "duplicateKey", value.asInstanceOf[js.Any])
      
      inline def setDuplicateKeyUndefined: Self = StObject.set(x, "duplicateKey", js.undefined)
      
      inline def setDuplicateText(value: String): Self = StObject.set(x, "duplicateText", value.asInstanceOf[js.Any])
      
      inline def setDuplicateTextUndefined: Self = StObject.set(x, "duplicateText", js.undefined)
      
      inline def setDuplicateTitle(value: String): Self = StObject.set(x, "duplicateTitle", value.asInstanceOf[js.Any])
      
      inline def setDuplicateTitleUndefined: Self = StObject.set(x, "duplicateTitle", js.undefined)
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setExamples(value: String): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      inline def setExpandAll(value: String): Self = StObject.set(x, "expandAll", value.asInstanceOf[js.Any])
      
      inline def setExpandAllUndefined: Self = StObject.set(x, "expandAll", js.undefined)
      
      inline def setExpandTitle(value: String): Self = StObject.set(x, "expandTitle", value.asInstanceOf[js.Any])
      
      inline def setExpandTitleUndefined: Self = StObject.set(x, "expandTitle", js.undefined)
      
      inline def setExtract(value: String): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setExtractTitle(value: String): Self = StObject.set(x, "extractTitle", value.asInstanceOf[js.Any])
      
      inline def setExtractTitleUndefined: Self = StObject.set(x, "extractTitle", js.undefined)
      
      inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      inline def setFormatTitle(value: String): Self = StObject.set(x, "formatTitle", value.asInstanceOf[js.Any])
      
      inline def setFormatTitleUndefined: Self = StObject.set(x, "formatTitle", js.undefined)
      
      inline def setInsert(value: String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertSub(value: String): Self = StObject.set(x, "insertSub", value.asInstanceOf[js.Any])
      
      inline def setInsertSubUndefined: Self = StObject.set(x, "insertSub", js.undefined)
      
      inline def setInsertTitle(value: String): Self = StObject.set(x, "insertTitle", value.asInstanceOf[js.Any])
      
      inline def setInsertTitleUndefined: Self = StObject.set(x, "insertTitle", js.undefined)
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setModeCodeText(value: String): Self = StObject.set(x, "modeCodeText", value.asInstanceOf[js.Any])
      
      inline def setModeCodeTextUndefined: Self = StObject.set(x, "modeCodeText", js.undefined)
      
      inline def setModeCodeTitle(value: String): Self = StObject.set(x, "modeCodeTitle", value.asInstanceOf[js.Any])
      
      inline def setModeCodeTitleUndefined: Self = StObject.set(x, "modeCodeTitle", js.undefined)
      
      inline def setModeEditorTitle(value: String): Self = StObject.set(x, "modeEditorTitle", value.asInstanceOf[js.Any])
      
      inline def setModeEditorTitleUndefined: Self = StObject.set(x, "modeEditorTitle", js.undefined)
      
      inline def setModeFormText(value: String): Self = StObject.set(x, "modeFormText", value.asInstanceOf[js.Any])
      
      inline def setModeFormTextUndefined: Self = StObject.set(x, "modeFormText", js.undefined)
      
      inline def setModeFormTitle(value: String): Self = StObject.set(x, "modeFormTitle", value.asInstanceOf[js.Any])
      
      inline def setModeFormTitleUndefined: Self = StObject.set(x, "modeFormTitle", js.undefined)
      
      inline def setModePreviewText(value: String): Self = StObject.set(x, "modePreviewText", value.asInstanceOf[js.Any])
      
      inline def setModePreviewTextUndefined: Self = StObject.set(x, "modePreviewText", js.undefined)
      
      inline def setModePreviewTitle(value: String): Self = StObject.set(x, "modePreviewTitle", value.asInstanceOf[js.Any])
      
      inline def setModePreviewTitleUndefined: Self = StObject.set(x, "modePreviewTitle", js.undefined)
      
      inline def setModeTextText(value: String): Self = StObject.set(x, "modeTextText", value.asInstanceOf[js.Any])
      
      inline def setModeTextTextUndefined: Self = StObject.set(x, "modeTextText", js.undefined)
      
      inline def setModeTextTitle(value: String): Self = StObject.set(x, "modeTextTitle", value.asInstanceOf[js.Any])
      
      inline def setModeTextTitleUndefined: Self = StObject.set(x, "modeTextTitle", js.undefined)
      
      inline def setModeTreeText(value: String): Self = StObject.set(x, "modeTreeText", value.asInstanceOf[js.Any])
      
      inline def setModeTreeTextUndefined: Self = StObject.set(x, "modeTreeText", js.undefined)
      
      inline def setModeTreeTitle(value: String): Self = StObject.set(x, "modeTreeTitle", value.asInstanceOf[js.Any])
      
      inline def setModeTreeTitleUndefined: Self = StObject.set(x, "modeTreeTitle", js.undefined)
      
      inline def setModeViewText(value: String): Self = StObject.set(x, "modeViewText", value.asInstanceOf[js.Any])
      
      inline def setModeViewTextUndefined: Self = StObject.set(x, "modeViewText", js.undefined)
      
      inline def setModeViewTitle(value: String): Self = StObject.set(x, "modeViewTitle", value.asInstanceOf[js.Any])
      
      inline def setModeViewTitleUndefined: Self = StObject.set(x, "modeViewTitle", js.undefined)
      
      inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
      
      inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      inline def setOpenUrl(value: String): Self = StObject.set(x, "openUrl", value.asInstanceOf[js.Any])
      
      inline def setOpenUrlUndefined: Self = StObject.set(x, "openUrl", js.undefined)
      
      inline def setRedo(value: String): Self = StObject.set(x, "redo", value.asInstanceOf[js.Any])
      
      inline def setRedoUndefined: Self = StObject.set(x, "redo", js.undefined)
      
      inline def setRemoveField(value: String): Self = StObject.set(x, "removeField", value.asInstanceOf[js.Any])
      
      inline def setRemoveFieldUndefined: Self = StObject.set(x, "removeField", js.undefined)
      
      inline def setRemoveText(value: String): Self = StObject.set(x, "removeText", value.asInstanceOf[js.Any])
      
      inline def setRemoveTextUndefined: Self = StObject.set(x, "removeText", js.undefined)
      
      inline def setRemoveTitle(value: String): Self = StObject.set(x, "removeTitle", value.asInstanceOf[js.Any])
      
      inline def setRemoveTitleUndefined: Self = StObject.set(x, "removeTitle", js.undefined)
      
      inline def setRepairTitle(value: String): Self = StObject.set(x, "repairTitle", value.asInstanceOf[js.Any])
      
      inline def setRepairTitleUndefined: Self = StObject.set(x, "repairTitle", js.undefined)
      
      inline def setSearchNextResultTitle(value: String): Self = StObject.set(x, "searchNextResultTitle", value.asInstanceOf[js.Any])
      
      inline def setSearchNextResultTitleUndefined: Self = StObject.set(x, "searchNextResultTitle", js.undefined)
      
      inline def setSearchPreviousResultTitle(value: String): Self = StObject.set(x, "searchPreviousResultTitle", value.asInstanceOf[js.Any])
      
      inline def setSearchPreviousResultTitleUndefined: Self = StObject.set(x, "searchPreviousResultTitle", js.undefined)
      
      inline def setSearchTitle(value: String): Self = StObject.set(x, "searchTitle", value.asInstanceOf[js.Any])
      
      inline def setSearchTitleUndefined: Self = StObject.set(x, "searchTitle", js.undefined)
      
      inline def setSelectNode(value: String): Self = StObject.set(x, "selectNode", value.asInstanceOf[js.Any])
      
      inline def setSelectNodeUndefined: Self = StObject.set(x, "selectNode", js.undefined)
      
      inline def setShowAll(value: String): Self = StObject.set(x, "showAll", value.asInstanceOf[js.Any])
      
      inline def setShowAllUndefined: Self = StObject.set(x, "showAll", js.undefined)
      
      inline def setShowMore(value: String): Self = StObject.set(x, "showMore", value.asInstanceOf[js.Any])
      
      inline def setShowMoreStatus(value: String): Self = StObject.set(x, "showMoreStatus", value.asInstanceOf[js.Any])
      
      inline def setShowMoreStatusUndefined: Self = StObject.set(x, "showMoreStatus", js.undefined)
      
      inline def setShowMoreUndefined: Self = StObject.set(x, "showMore", js.undefined)
      
      inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortAscending(value: String): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
      
      inline def setSortAscendingTitle(value: String): Self = StObject.set(x, "sortAscendingTitle", value.asInstanceOf[js.Any])
      
      inline def setSortAscendingTitleUndefined: Self = StObject.set(x, "sortAscendingTitle", js.undefined)
      
      inline def setSortAscendingUndefined: Self = StObject.set(x, "sortAscending", js.undefined)
      
      inline def setSortDescending(value: String): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
      
      inline def setSortDescendingTitle(value: String): Self = StObject.set(x, "sortDescendingTitle", value.asInstanceOf[js.Any])
      
      inline def setSortDescendingTitleUndefined: Self = StObject.set(x, "sortDescendingTitle", js.undefined)
      
      inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
      
      inline def setSortDirectionLabel(value: String): Self = StObject.set(x, "sortDirectionLabel", value.asInstanceOf[js.Any])
      
      inline def setSortDirectionLabelUndefined: Self = StObject.set(x, "sortDirectionLabel", js.undefined)
      
      inline def setSortFieldLabel(value: String): Self = StObject.set(x, "sortFieldLabel", value.asInstanceOf[js.Any])
      
      inline def setSortFieldLabelUndefined: Self = StObject.set(x, "sortFieldLabel", js.undefined)
      
      inline def setSortFieldTitle(value: String): Self = StObject.set(x, "sortFieldTitle", value.asInstanceOf[js.Any])
      
      inline def setSortFieldTitleUndefined: Self = StObject.set(x, "sortFieldTitle", js.undefined)
      
      inline def setSortTitle(value: String): Self = StObject.set(x, "sortTitle", value.asInstanceOf[js.Any])
      
      inline def setSortTitleShort(value: String): Self = StObject.set(x, "sortTitleShort", value.asInstanceOf[js.Any])
      
      inline def setSortTitleShortUndefined: Self = StObject.set(x, "sortTitleShort", js.undefined)
      
      inline def setSortTitleUndefined: Self = StObject.set(x, "sortTitle", js.undefined)
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringType(value: String): Self = StObject.set(x, "stringType", value.asInstanceOf[js.Any])
      
      inline def setStringTypeUndefined: Self = StObject.set(x, "stringType", js.undefined)
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformPreviewLabel(value: String): Self = StObject.set(x, "transformPreviewLabel", value.asInstanceOf[js.Any])
      
      inline def setTransformPreviewLabelUndefined: Self = StObject.set(x, "transformPreviewLabel", js.undefined)
      
      inline def setTransformQueryLabel(value: String): Self = StObject.set(x, "transformQueryLabel", value.asInstanceOf[js.Any])
      
      inline def setTransformQueryLabelUndefined: Self = StObject.set(x, "transformQueryLabel", js.undefined)
      
      inline def setTransformQueryTitle(value: String): Self = StObject.set(x, "transformQueryTitle", value.asInstanceOf[js.Any])
      
      inline def setTransformQueryTitleUndefined: Self = StObject.set(x, "transformQueryTitle", js.undefined)
      
      inline def setTransformTitle(value: String): Self = StObject.set(x, "transformTitle", value.asInstanceOf[js.Any])
      
      inline def setTransformTitleShort(value: String): Self = StObject.set(x, "transformTitleShort", value.asInstanceOf[js.Any])
      
      inline def setTransformTitleShortUndefined: Self = StObject.set(x, "transformTitleShort", js.undefined)
      
      inline def setTransformTitleUndefined: Self = StObject.set(x, "transformTitle", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransformWizardFilter(value: String): Self = StObject.set(x, "transformWizardFilter", value.asInstanceOf[js.Any])
      
      inline def setTransformWizardFilterUndefined: Self = StObject.set(x, "transformWizardFilter", js.undefined)
      
      inline def setTransformWizardLabel(value: String): Self = StObject.set(x, "transformWizardLabel", value.asInstanceOf[js.Any])
      
      inline def setTransformWizardLabelUndefined: Self = StObject.set(x, "transformWizardLabel", js.undefined)
      
      inline def setTransformWizardSelectFields(value: String): Self = StObject.set(x, "transformWizardSelectFields", value.asInstanceOf[js.Any])
      
      inline def setTransformWizardSelectFieldsUndefined: Self = StObject.set(x, "transformWizardSelectFields", js.undefined)
      
      inline def setTransformWizardSortBy(value: String): Self = StObject.set(x, "transformWizardSortBy", value.asInstanceOf[js.Any])
      
      inline def setTransformWizardSortByUndefined: Self = StObject.set(x, "transformWizardSortBy", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeTitle(value: String): Self = StObject.set(x, "typeTitle", value.asInstanceOf[js.Any])
      
      inline def setTypeTitleUndefined: Self = StObject.set(x, "typeTitle", js.undefined)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUndo(value: String): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
      
      inline def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
      
      inline def setValidationCannotMove(value: String): Self = StObject.set(x, "validationCannotMove", value.asInstanceOf[js.Any])
      
      inline def setValidationCannotMoveUndefined: Self = StObject.set(x, "validationCannotMove", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var path: JSONPath
  }
  object Path {
    
    inline def apply(path: JSONPath): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setPath(value: JSONPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait Start extends StObject {
    
    var end: SelectionPosition
    
    var start: SelectionPosition
    
    var text: String
  }
  object Start {
    
    inline def apply(end: SelectionPosition, start: SelectionPosition, text: String): Start = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: SelectionPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SelectionPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
