package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.aircraft
import typings.hafasClient.hafasClientStrings.bicycle
import typings.hafasClient.hafasClientStrings.bus
import typings.hafasClient.hafasClientStrings.car
import typings.hafasClient.hafasClientStrings.gondola
import typings.hafasClient.hafasClientStrings.taxi
import typings.hafasClient.hafasClientStrings.train
import typings.hafasClient.hafasClientStrings.walking
import typings.hafasClient.hafasClientStrings.watercraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ProductType relates to how a means of transport "works" in local context.
  * Example: Even though S-Bahn and U-Bahn in Berlin are both trains, they have different operators, service patterns,
  * stations and look different. Therefore, they are two distinct products subway and suburban.
  */
@js.native
trait ProductType extends js.Object {
  
  var bitmasks: js.Array[Double] = js.native
  
  var default: Boolean = js.native
  
  var id: String = js.native
  
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking = js.native
  
  var name: String = js.native
  
  var short: String = js.native
}
object ProductType {
  
  @scala.inline
  def apply(
    bitmasks: js.Array[Double],
    default: Boolean,
    id: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    name: String,
    short: String
  ): ProductType = {
    val __obj = js.Dynamic.literal(bitmasks = bitmasks.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductType]
  }
  
  @scala.inline
  implicit class ProductTypeOps[Self <: ProductType] (val x: Self) extends AnyVal {
    
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
    def setBitmasksVarargs(value: Double*): Self = this.set("bitmasks", js.Array(value :_*))
    
    @scala.inline
    def setBitmasks(value: js.Array[Double]): Self = this.set("bitmasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
  }
}
