package typings.looksSame.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options passed to looksSame.createDiff function
  */
@js.native
trait CreateDiffOptions extends CreateDiffAsBufferOptions {
  
  /**
    * The diff image path to store
    */
  var diff: String = js.native
}
object CreateDiffOptions {
  
  @scala.inline
  def apply(
    current: String | Buffer | BoundedImage,
    diff: String,
    highlightColor: String,
    reference: String | Buffer | BoundedImage
  ): CreateDiffOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiffOptions]
  }
  
  @scala.inline
  implicit class CreateDiffOptionsOps[Self <: CreateDiffOptions] (val x: Self) extends AnyVal {
    
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
    def setDiff(value: String): Self = this.set("diff", value.asInstanceOf[js.Any])
  }
}
