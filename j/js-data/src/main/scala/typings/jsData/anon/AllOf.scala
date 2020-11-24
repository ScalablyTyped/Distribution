package typings.jsData.anon

import typings.jsData.mod.SchemaValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllOf extends js.Object {
  
  def allOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def anyOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def dependencies(value: js.Any, schema: js.Any, opts: js.Any): Unit = js.native
  
  def enum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def items(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def maxItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def maxLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def maxProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def maximum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def minItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def minLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def minProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def minimum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def multipleOf(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def not(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def oneOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def pattern(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def properties(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def required(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def `type`(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  
  def uniqueItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
}
object AllOf {
  
  @scala.inline
  def apply(
    allOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    anyOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    dependencies: (js.Any, js.Any, js.Any) => Unit,
    enum: (js.Any, js.Any, js.Any) => SchemaValidationError,
    items: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    maxItems: (js.Any, js.Any, js.Any) => SchemaValidationError,
    maxLength: (js.Any, js.Any, js.Any) => SchemaValidationError,
    maxProperties: (js.Any, js.Any, js.Any) => SchemaValidationError,
    maximum: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minItems: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minLength: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minProperties: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minimum: (js.Any, js.Any, js.Any) => SchemaValidationError,
    multipleOf: (js.Any, js.Any, js.Any) => SchemaValidationError,
    not: (js.Any, js.Any, js.Any) => SchemaValidationError,
    oneOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    pattern: (js.Any, js.Any, js.Any) => SchemaValidationError,
    properties: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    required: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    `type`: (js.Any, js.Any, js.Any) => SchemaValidationError,
    uniqueItems: (js.Any, js.Any, js.Any) => SchemaValidationError
  ): AllOf = {
    val __obj = js.Dynamic.literal(allOf = js.Any.fromFunction3(allOf), anyOf = js.Any.fromFunction3(anyOf), dependencies = js.Any.fromFunction3(dependencies), enum = js.Any.fromFunction3(enum), items = js.Any.fromFunction3(items), maxItems = js.Any.fromFunction3(maxItems), maxLength = js.Any.fromFunction3(maxLength), maxProperties = js.Any.fromFunction3(maxProperties), maximum = js.Any.fromFunction3(maximum), minItems = js.Any.fromFunction3(minItems), minLength = js.Any.fromFunction3(minLength), minProperties = js.Any.fromFunction3(minProperties), minimum = js.Any.fromFunction3(minimum), multipleOf = js.Any.fromFunction3(multipleOf), not = js.Any.fromFunction3(not), oneOf = js.Any.fromFunction3(oneOf), pattern = js.Any.fromFunction3(pattern), properties = js.Any.fromFunction3(properties), required = js.Any.fromFunction3(required), uniqueItems = js.Any.fromFunction3(uniqueItems))
    __obj.updateDynamic("type")(js.Any.fromFunction3(`type`))
    __obj.asInstanceOf[AllOf]
  }
  
  @scala.inline
  implicit class AllOfOps[Self <: AllOf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllOf(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("allOf", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAnyOf(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("anyOf", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDependencies(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("dependencies", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnum(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("enum", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItems(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("items", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMaxItems(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("maxItems", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMaxLength(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("maxLength", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMaxProperties(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("maxProperties", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMaximum(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("maximum", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMinItems(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("minItems", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMinLength(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("minLength", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMinProperties(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("minProperties", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMinimum(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("minimum", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMultipleOf(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("multipleOf", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNot(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("not", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOneOf(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("oneOf", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPattern(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("pattern", js.Any.fromFunction3(value))
    
    @scala.inline
    def setProperties(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("properties", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRequired(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("required", js.Any.fromFunction3(value))
    
    @scala.inline
    def setType(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("type", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUniqueItems(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = this.set("uniqueItems", js.Any.fromFunction3(value))
  }
}
