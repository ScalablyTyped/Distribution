package typings.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var checkLineBreaks: Boolean = js.native
  
  var filename: String | Null = js.native
  
  var implicitTypes: js.Array[Type] = js.native
  
  var input: String = js.native
  
  var json: Boolean = js.native
  
  var kind: String = js.native
  
  var length: Double = js.native
  
  var line: Double = js.native
  
  var lineIndent: Double = js.native
  
  var lineStart: Double = js.native
  
  def onWarning(e: YAMLException): Unit = js.native
  
  var position: Double = js.native
  
  var result: js.Any = js.native
  
  var schema: SchemaDefinition = js.native
  
  var version: Null | Double = js.native
}
object State {
  
  @scala.inline
  def apply(
    checkLineBreaks: Boolean,
    implicitTypes: js.Array[Type],
    input: String,
    json: Boolean,
    kind: String,
    length: Double,
    line: Double,
    lineIndent: Double,
    lineStart: Double,
    onWarning: YAMLException => Unit,
    position: Double,
    result: js.Any,
    schema: SchemaDefinition
  ): State = {
    val __obj = js.Dynamic.literal(checkLineBreaks = checkLineBreaks.asInstanceOf[js.Any], implicitTypes = implicitTypes.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineIndent = lineIndent.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], onWarning = js.Any.fromFunction1(onWarning), position = position.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setCheckLineBreaks(value: Boolean): Self = this.set("checkLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitTypesVarargs(value: Type*): Self = this.set("implicitTypes", js.Array(value :_*))
    
    @scala.inline
    def setImplicitTypes(value: js.Array[Type]): Self = this.set("implicitTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineIndent(value: Double): Self = this.set("lineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStart(value: Double): Self = this.set("lineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWarning(value: YAMLException => Unit): Self = this.set("onWarning", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: SchemaDefinition): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameNull: Self = this.set("filename", null)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
}
