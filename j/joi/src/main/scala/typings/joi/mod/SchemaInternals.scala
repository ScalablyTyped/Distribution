package typings.joi.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInternals extends StObject {
  
  /**
    * Adds a rule to current validation schema.
    */
  @JSName("$_addRule")
  def $_addRule(rule: String): Schema = js.native
  @JSName("$_addRule")
  def $_addRule(rule: AddRuleOptions): Schema = js.native
  
  /**
    * Internally compiles schema.
    */
  @JSName("$_compile")
  def $_compile(schema: SchemaLike): Schema = js.native
  @JSName("$_compile")
  def $_compile(schema: SchemaLike, options: CompileOptions): Schema = js.native
  
  /**
    * Creates a joi error object.
    */
  @JSName("$_createError")
  def $_createError(code: String, value: js.Any, context: Context, state: State, prefs: ValidationOptions): Err = js.native
  @JSName("$_createError")
  def $_createError(
    code: String,
    value: js.Any,
    context: Context,
    state: State,
    prefs: ValidationOptions,
    options: CreateErrorOptions
  ): Err = js.native
  
  /**
    * Get value from given flag.
    */
  @JSName("$_getFlag")
  def $_getFlag(name: String): js.Any = js.native
  
  /**
    * Retrieve some rule configuration.
    */
  @JSName("$_getRule")
  def $_getRule(name: String): js.UndefOr[GetRuleOptions] = js.native
  
  @JSName("$_mapLabels")
  def $_mapLabels(path: String): String = js.native
  @JSName("$_mapLabels")
  def $_mapLabels(path: js.Array[String]): String = js.native
  
  /**
    * Returns true if validations runs fine on given value.
    */
  @JSName("$_match")
  def $_match(value: js.Any, state: State, prefs: ValidationOptions): Boolean = js.native
  
  @JSName("$_modify")
  def $_modify(): Schema = js.native
  @JSName("$_modify")
  def $_modify(options: ModifyOptions): Schema = js.native
  
  /**
    * Resets current schema.
    */
  @JSName("$_mutateRebuild")
  def $_mutateRebuild(): this.type = js.native
  
  @JSName("$_mutateRegister")
  def $_mutateRegister(schema: Schema): Unit = js.native
  @JSName("$_mutateRegister")
  def $_mutateRegister(schema: Schema, options: MutateRegisterOptions): Unit = js.native
  
  /**
    * Get value from given property.
    */
  @JSName("$_property")
  def $_property(name: String): js.Any = js.native
  
  /**
    * Get schema at given path.
    */
  @JSName("$_reach")
  def $_reach(path: js.Array[String]): Schema = js.native
  
  /**
    * Get current schema root references.
    */
  @JSName("$_rootReferences")
  def $_rootReferences(): js.Any = js.native
  
  /**
    * Set flag to given value.
    */
  @JSName("$_setFlag")
  def $_setFlag(flag: String, value: js.Any): Unit = js.native
  @JSName("$_setFlag")
  def $_setFlag(flag: String, value: js.Any, options: SetFlagOptions): Unit = js.native
  
  /**
    * Parent schema object.
    */
  @JSName("$_super")
  var $_super: Schema = js.native
  
  /**
    * Terms of current schema.
    */
  @JSName("$_terms")
  var $_terms: Record[String, _] = js.native
  
  /**
    * Runs internal validations against given value.
    */
  @JSName("$_validate")
  def $_validate(value: js.Any, state: State, prefs: ValidationOptions): ValidationResult = js.native
}
