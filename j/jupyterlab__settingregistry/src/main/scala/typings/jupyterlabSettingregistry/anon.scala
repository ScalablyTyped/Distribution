package typings.jupyterlabSettingregistry

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin.Transform
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: TypeString
    
    var command: TypeString
    
    var disabled: Default
    
    var keys: MinItems
    
    var selector: TypeString
  }
  object Args {
    
    inline def apply(args: TypeString, command: TypeString, disabled: Default, keys: MinItems, selector: TypeString): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: TypeString): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: TypeString): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Default): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: MinItems): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: TypeString): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  trait Composite extends StObject {
    
    var composite: js.UndefOr[PartialJSONValue] = js.undefined
    
    var user: js.UndefOr[PartialJSONValue] = js.undefined
  }
  object Composite {
    
    inline def apply(): Composite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Composite]
    }
    
    extension [Self <: Composite](x: Self) {
      
      inline def setComposite(value: PartialJSONValue): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      inline def setCompositeNull: Self = StObject.set(x, "composite", null)
      
      inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      inline def setUser(value: PartialJSONValue): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait Default extends StObject {
    
    var default: Boolean
    
    var `type`: String
  }
  object Default {
    
    inline def apply(default: Boolean, `type`: String): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Items extends StObject {
    
    var default: js.Array[scala.Nothing]
    
    var items: Ref
    
    var `type`: String
  }
  object Items {
    
    inline def apply(default: js.Array[scala.Nothing], items: Ref, `type`: String): Items = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setDefault(value: js.Array[scala.Nothing]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultVarargs(value: scala.Nothing*): Self = StObject.set(x, "default", js.Array(value :_*))
      
      inline def setItems(value: Ref): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Jupyterlabsettingdeprecated extends StObject {
    
    @JSName("jupyter.lab.setting-deprecated")
    var `jupyterDotlabDotsetting-deprecated`: Default
    
    @JSName("jupyter.lab.setting-icon")
    var `jupyterDotlabDotsetting-icon`: Type
    
    @JSName("jupyter.lab.setting-icon-class")
    var `jupyterDotlabDotsetting-icon-class`: Type
    
    @JSName("jupyter.lab.setting-icon-label")
    var `jupyterDotlabDotsetting-icon-label`: Type
    
    @JSName("jupyter.lab.shortcuts")
    var jupyterDotlabDotshortcuts: Items
    
    @JSName("jupyter.lab.transform")
    var jupyterDotlabDottransform: Default
  }
  object Jupyterlabsettingdeprecated {
    
    inline def apply(
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
    
    extension [Self <: Jupyterlabsettingdeprecated](x: Self) {
      
      inline def `setJupyterDotlabDotsetting-deprecated`(value: Default): Self = StObject.set(x, "jupyter.lab.setting-deprecated", value.asInstanceOf[js.Any])
      
      inline def `setJupyterDotlabDotsetting-icon`(value: Type): Self = StObject.set(x, "jupyter.lab.setting-icon", value.asInstanceOf[js.Any])
      
      inline def `setJupyterDotlabDotsetting-icon-class`(value: Type): Self = StObject.set(x, "jupyter.lab.setting-icon-class", value.asInstanceOf[js.Any])
      
      inline def `setJupyterDotlabDotsetting-icon-label`(value: Type): Self = StObject.set(x, "jupyter.lab.setting-icon-label", value.asInstanceOf[js.Any])
      
      inline def setJupyterDotlabDotshortcuts(value: Items): Self = StObject.set(x, "jupyter.lab.shortcuts", value.asInstanceOf[js.Any])
      
      inline def setJupyterDotlabDottransform(value: Default): Self = StObject.set(x, "jupyter.lab.transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait MinItems extends StObject {
    
    var items: TypeString
    
    var minItems: Double
    
    var `type`: String
  }
  object MinItems {
    
    inline def apply(items: TypeString, minItems: Double, `type`: String): MinItems = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinItems]
    }
    
    extension [Self <: MinItems](x: Self) {
      
      inline def setItems(value: TypeString): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Properties extends StObject {
    
    var properties: Args
    
    var required: js.Array[String]
    
    var `type`: String
  }
  object Properties {
    
    inline def apply(properties: Args, required: js.Array[String], `type`: String): Properties = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Properties]
    }
    
    extension [Self <: Properties](x: Self) {
      
      inline def setProperties(value: Args): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref extends StObject {
    
    @JSName("$ref")
    var $ref: String
  }
  object Ref {
    
    inline def apply($ref: String): Ref = {
      val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait Shortcut extends StObject {
    
    var shortcut: Properties
  }
  object Shortcut {
    
    inline def apply(shortcut: Properties): Shortcut = {
      val __obj = js.Dynamic.literal(shortcut = shortcut.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shortcut]
    }
    
    extension [Self <: Shortcut](x: Self) {
      
      inline def setShortcut(value: Properties): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var default: String
    
    var `type`: String
  }
  object Type {
    
    inline def apply(default: String, `type`: String): Type = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeString extends StObject {
    
    var `type`: String
  }
  object TypeString {
    
    inline def apply(`type`: String): TypeString = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeString]
    }
    
    extension [Self <: TypeString](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait User extends StObject {
    
    var composite: js.UndefOr[ReadonlyPartialJSONValue] = js.undefined
    
    var user: js.UndefOr[ReadonlyPartialJSONValue] = js.undefined
  }
  object User {
    
    inline def apply(): User = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setComposite(value: ReadonlyPartialJSONValue): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      inline def setCompositeNull: Self = StObject.set(x, "composite", null)
      
      inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      inline def setUser(value: ReadonlyPartialJSONValue): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Inlined {[ phase in @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/settingregistry.@jupyterlab/settingregistry/lib/tokens.ISettingRegistry.IPlugin.Transform} */
  trait phaseinPhaseTransform extends StObject {
    
    var compose: js.UndefOr[Transform] = js.undefined
    
    var fetch: js.UndefOr[Transform] = js.undefined
  }
  object phaseinPhaseTransform {
    
    inline def apply(): phaseinPhaseTransform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[phaseinPhaseTransform]
    }
    
    extension [Self <: phaseinPhaseTransform](x: Self) {
      
      inline def setCompose(value: /* plugin */ IPlugin => IPlugin): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      inline def setComposeUndefined: Self = StObject.set(x, "compose", js.undefined)
      
      inline def setFetch(value: /* plugin */ IPlugin => IPlugin): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    }
  }
}
