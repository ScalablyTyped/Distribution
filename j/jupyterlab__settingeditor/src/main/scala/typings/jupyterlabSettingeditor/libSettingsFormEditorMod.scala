package typings.jupyterlabSettingeditor

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabSettingeditor.libPluginlistMod.PluginList
import typings.jupyterlabSettingeditor.libSettingsFormEditorMod.SettingsFormEditor.IProps
import typings.jupyterlabSettingeditor.libSettingsFormEditorMod.SettingsFormEditor.IState
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.ISchema
import typings.jupyterlabSettingregistry.mod.Settings
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingsFormEditorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/SettingsFormEditor", "SettingsFormEditor")
  @js.native
  open class SettingsFormEditor protected () extends Component[IProps, IState, Any] {
    def this(props: IProps) = this()
    
    /* private */ var _debouncer: Any = js.native
    
    /* private */ var _formData: Any = js.native
    
    /* private */ var _onChange: Any = js.native
    
    /* private */ var _setFilteredSchema: Any = js.native
    
    /* private */ var _setUiSchema: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSettingsFormEditor(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSettingsFormEditor(prevProps: IProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSettingsFormEditor(): Unit = js.native
    
    /**
      * Handler for edits made in the form editor.
      * @param data - Form data sent from the form editor
      */
    def handleChange(): Unit = js.native
    
    /**
      * Callback on plugin selection
      * @param list Plugin list
      * @param id Plugin id
      */
    /* protected */ def onSelect(list: PluginList, id: String): Unit = js.native
    
    /**
      * Handler for the "Restore to defaults" button - clears all
      * modified settings then calls `setFormData` to restore the
      * values.
      */
    def reset(event: MouseEvent[Element, NativeMouseEvent]): js.Promise[Unit] = js.native
  }
  object SettingsFormEditor {
    
    /**
      * Props passed to the SettingsFormEditor component
      */
    trait IProps extends StObject {
      
      /**
        * List of strings that match search value.
        */
      var filteredValues: js.Array[String] | Null
      
      /**
        * Callback to update the plugin list when a validation error occurs.
        */
      def hasError(error: Boolean): Unit
      
      /**
        * Whether the form is collapsed or not.
        */
      var isCollapsed: Boolean
      
      /**
        * Callback with the collapse state value.
        */
      def onCollapseChange(v: Boolean): Unit
      
      /**
        * Handler for when selection change is triggered by scrolling
        * in the SettingsPanel.
        */
      def onSelect(id: String): Unit
      
      /**
        * Dictionary used for custom field renderers in the form.
        */
      var renderers: StringDictionary[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any
          ]
      
      /**
        * Settings object with schema and user defined values.
        */
      var settings: Settings
      
      /**
        * Translator object
        */
      var translator: ITranslator
      
      /**
        * Sends whether this editor has unsaved changes to the parent class.
        */
      def updateDirtyState(dirty: Boolean): Unit
    }
    object IProps {
      
      inline def apply(
        hasError: Boolean => Unit,
        isCollapsed: Boolean,
        onCollapseChange: Boolean => Unit,
        onSelect: String => Unit,
        renderers: StringDictionary[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any
            ],
        settings: Settings,
        translator: ITranslator,
        updateDirtyState: Boolean => Unit
      ): IProps = {
        val __obj = js.Dynamic.literal(hasError = js.Any.fromFunction1(hasError), isCollapsed = isCollapsed.asInstanceOf[js.Any], onCollapseChange = js.Any.fromFunction1(onCollapseChange), onSelect = js.Any.fromFunction1(onSelect), renderers = renderers.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], translator = translator.asInstanceOf[js.Any], updateDirtyState = js.Any.fromFunction1(updateDirtyState), filteredValues = null)
        __obj.asInstanceOf[IProps]
      }
      
      extension [Self <: IProps](x: Self) {
        
        inline def setFilteredValues(value: js.Array[String]): Self = StObject.set(x, "filteredValues", value.asInstanceOf[js.Any])
        
        inline def setFilteredValuesNull: Self = StObject.set(x, "filteredValues", null)
        
        inline def setFilteredValuesVarargs(value: String*): Self = StObject.set(x, "filteredValues", js.Array(value*))
        
        inline def setHasError(value: Boolean => Unit): Self = StObject.set(x, "hasError", js.Any.fromFunction1(value))
        
        inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
        
        inline def setOnCollapseChange(value: Boolean => Unit): Self = StObject.set(x, "onCollapseChange", js.Any.fromFunction1(value))
        
        inline def setOnSelect(value: String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        inline def setRenderers(
          value: StringDictionary[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any
                ]
        ): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
        
        inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setUpdateDirtyState(value: Boolean => Unit): Self = StObject.set(x, "updateDirtyState", js.Any.fromFunction1(value))
      }
    }
    
    trait IState extends StObject {
      
      /**
        * Array Field template
        */
      var arrayFieldTemplate: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<ArrayFieldTemplateProps<any>> */ Any
          ] = js.undefined
      
      /**
        * Field template
        */
      var fieldTemplate: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<FieldTemplateProps<any>> */ Any
          ] = js.undefined
      
      /**
        * Filtered schema
        */
      var filteredSchema: js.UndefOr[ISchema] = js.undefined
      
      /**
        * Form context
        */
      var formContext: js.UndefOr[Any] = js.undefined
      
      /**
        * Indicates whether the settings have been modified. Used for hiding
        * the "Restore to Default" button when there are no changes.
        */
      var isModified: Boolean
      
      /**
        * Object Field template
        */
      var objectFieldTemplate: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<ObjectFieldTemplateProps<any>> */ Any
          ] = js.undefined
      
      /**
        * Form UI schema
        */
      var uiSchema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UiSchema */ Any
    }
    object IState {
      
      inline def apply(
        isModified: Boolean,
        uiSchema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UiSchema */ Any
      ): IState = {
        val __obj = js.Dynamic.literal(isModified = isModified.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
        __obj.asInstanceOf[IState]
      }
      
      extension [Self <: IState](x: Self) {
        
        inline def setArrayFieldTemplate(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<ArrayFieldTemplateProps<any>> */ Any
        ): Self = StObject.set(x, "arrayFieldTemplate", value.asInstanceOf[js.Any])
        
        inline def setArrayFieldTemplateUndefined: Self = StObject.set(x, "arrayFieldTemplate", js.undefined)
        
        inline def setFieldTemplate(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<FieldTemplateProps<any>> */ Any
        ): Self = StObject.set(x, "fieldTemplate", value.asInstanceOf[js.Any])
        
        inline def setFieldTemplateUndefined: Self = StObject.set(x, "fieldTemplate", js.undefined)
        
        inline def setFilteredSchema(value: ISchema): Self = StObject.set(x, "filteredSchema", value.asInstanceOf[js.Any])
        
        inline def setFilteredSchemaUndefined: Self = StObject.set(x, "filteredSchema", js.undefined)
        
        inline def setFormContext(value: Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
        
        inline def setFormContextUndefined: Self = StObject.set(x, "formContext", js.undefined)
        
        inline def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
        
        inline def setObjectFieldTemplate(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<ObjectFieldTemplateProps<any>> */ Any
        ): Self = StObject.set(x, "objectFieldTemplate", value.asInstanceOf[js.Any])
        
        inline def setObjectFieldTemplateUndefined: Self = StObject.set(x, "objectFieldTemplate", js.undefined)
        
        inline def setUiSchema(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UiSchema */ Any
        ): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
      }
    }
  }
}
