package typings.jupyterlabSettingregistry

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin.Transform
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Args extends StObject {
    
    var args: TypeString = js.native
    
    var command: TypeString = js.native
    
    var disabled: Default = js.native
    
    var keys: MinItems = js.native
    
    var selector: TypeString = js.native
  }
  object Args {
    
    @scala.inline
    def apply(args: TypeString, command: TypeString, disabled: Default, keys: MinItems, selector: TypeString): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: TypeString): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: TypeString): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Default): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: MinItems): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: TypeString): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Composite extends StObject {
    
    var composite: js.UndefOr[PartialJSONValue] = js.native
    
    var user: js.UndefOr[PartialJSONValue] = js.native
  }
  object Composite {
    
    @scala.inline
    def apply(): Composite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Composite]
    }
    
    @scala.inline
    implicit class CompositeMutableBuilder[Self <: Composite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComposite(value: PartialJSONValue): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositeNull: Self = StObject.set(x, "composite", null)
      
      @scala.inline
      def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      @scala.inline
      def setUser(value: PartialJSONValue): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNull: Self = StObject.set(x, "user", null)
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait Default extends StObject {
    
    var default: Boolean = js.native
    
    var `type`: String = js.native
  }
  object Default {
    
    @scala.inline
    def apply(default: Boolean, `type`: String): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Items extends StObject {
    
    var default: js.Array[scala.Nothing] = js.native
    
    var items: Ref = js.native
    
    var `type`: String = js.native
  }
  object Items {
    
    @scala.inline
    def apply(default: js.Array[scala.Nothing], items: Ref, `type`: String): Items = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Array[scala.Nothing]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVarargs(value: scala.Nothing*): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setItems(value: Ref): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Jupyterlabsettingdeprecated extends StObject {
    
    @JSName("jupyter.lab.setting-deprecated")
    var `jupyterDotlabDotsetting-deprecated`: Default = js.native
    
    @JSName("jupyter.lab.setting-icon")
    var `jupyterDotlabDotsetting-icon`: Type = js.native
    
    @JSName("jupyter.lab.setting-icon-class")
    var `jupyterDotlabDotsetting-icon-class`: Type = js.native
    
    @JSName("jupyter.lab.setting-icon-label")
    var `jupyterDotlabDotsetting-icon-label`: Type = js.native
    
    @JSName("jupyter.lab.shortcuts")
    var jupyterDotlabDotshortcuts: Items = js.native
    
    @JSName("jupyter.lab.transform")
    var jupyterDotlabDottransform: Default = js.native
  }
  object Jupyterlabsettingdeprecated {
    
    @scala.inline
    def apply(
      `jupyterDotlabDotsetting-deprecated`: Default,
      `jupyterDotlabDotsetting-icon`: Type,
      `jupyterDotlabDotsetting-icon-class`: Type,
      `jupyterDotlabDotsetting-icon-label`: Type,
      jupyterDotlabDotshortcuts: Items,
      jupyterDotlabDottransform: Default
    ): Jupyterlabsettingdeprecated = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("jupyter.lab.setting-deprecated")(`jupyterDotlabDotsetting-deprecated`.asInstanceOf[js.Any])
      __obj.updateDynamic("jupyter.lab.setting-icon")(`jupyterDotlabDotsetting-icon`.asInstanceOf[js.Any])
      __obj.updateDynamic("jupyter.lab.setting-icon-class")(`jupyterDotlabDotsetting-icon-class`.asInstanceOf[js.Any])
      __obj.updateDynamic("jupyter.lab.setting-icon-label")(`jupyterDotlabDotsetting-icon-label`.asInstanceOf[js.Any])
      __obj.updateDynamic("jupyter.lab.shortcuts")(jupyterDotlabDotshortcuts.asInstanceOf[js.Any])
      __obj.updateDynamic("jupyter.lab.transform")(jupyterDotlabDottransform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Jupyterlabsettingdeprecated]
    }
    
    @scala.inline
    implicit class JupyterlabsettingdeprecatedMutableBuilder[Self <: Jupyterlabsettingdeprecated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setJupyterDotlabDotsetting-deprecated`(value: Default): Self = StObject.set(x, "jupyter.lab.setting-deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJupyterDotlabDotsetting-icon`(value: Type): Self = StObject.set(x, "jupyter.lab.setting-icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJupyterDotlabDotsetting-icon-class`(value: Type): Self = StObject.set(x, "jupyter.lab.setting-icon-class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJupyterDotlabDotsetting-icon-label`(value: Type): Self = StObject.set(x, "jupyter.lab.setting-icon-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJupyterDotlabDotshortcuts(value: Items): Self = StObject.set(x, "jupyter.lab.shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJupyterDotlabDottransform(value: Default): Self = StObject.set(x, "jupyter.lab.transform", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MinItems extends StObject {
    
    var items: TypeString = js.native
    
    var minItems: Double = js.native
    
    var `type`: String = js.native
  }
  object MinItems {
    
    @scala.inline
    def apply(items: TypeString, minItems: Double, `type`: String): MinItems = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinItems]
    }
    
    @scala.inline
    implicit class MinItemsMutableBuilder[Self <: MinItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: TypeString): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Properties extends StObject {
    
    var properties: Args = js.native
    
    var required: js.Array[String] = js.native
    
    var `type`: String = js.native
  }
  object Properties {
    
    @scala.inline
    def apply(properties: Args, required: js.Array[String], `type`: String): Properties = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Properties]
    }
    
    @scala.inline
    implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperties(value: Args): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ref extends StObject {
    
    @JSName("$ref")
    var $ref: String = js.native
  }
  object Ref {
    
    @scala.inline
    def apply($ref: String): Ref = {
      val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Shortcut extends StObject {
    
    var shortcut: Properties = js.native
  }
  object Shortcut {
    
    @scala.inline
    def apply(shortcut: Properties): Shortcut = {
      val __obj = js.Dynamic.literal(shortcut = shortcut.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shortcut]
    }
    
    @scala.inline
    implicit class ShortcutMutableBuilder[Self <: Shortcut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShortcut(value: Properties): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var default: String = js.native
    
    var `type`: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(default: String, `type`: String): Type = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeString extends StObject {
    
    var `type`: String = js.native
  }
  object TypeString {
    
    @scala.inline
    def apply(`type`: String): TypeString = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeString]
    }
    
    @scala.inline
    implicit class TypeStringMutableBuilder[Self <: TypeString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait User extends StObject {
    
    var composite: js.UndefOr[ReadonlyPartialJSONValue] = js.native
    
    var user: js.UndefOr[ReadonlyPartialJSONValue] = js.native
  }
  object User {
    
    @scala.inline
    def apply(): User = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComposite(value: ReadonlyPartialJSONValue): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositeNull: Self = StObject.set(x, "composite", null)
      
      @scala.inline
      def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      @scala.inline
      def setUser(value: ReadonlyPartialJSONValue): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNull: Self = StObject.set(x, "user", null)
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Inlined {[ phase in @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Transform} */
  @js.native
  trait phaseinPhaseTransform extends StObject {
    
    var compose: js.UndefOr[Transform] = js.native
    
    var fetch: js.UndefOr[Transform] = js.native
  }
  object phaseinPhaseTransform {
    
    @scala.inline
    def apply(): phaseinPhaseTransform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[phaseinPhaseTransform]
    }
    
    @scala.inline
    implicit class phaseinPhaseTransformMutableBuilder[Self <: phaseinPhaseTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompose(value: /* plugin */ IPlugin => IPlugin): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComposeUndefined: Self = StObject.set(x, "compose", js.undefined)
      
      @scala.inline
      def setFetch(value: /* plugin */ IPlugin => IPlugin): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    }
  }
}
