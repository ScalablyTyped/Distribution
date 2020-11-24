package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The details about how to run the execution.
  */
@js.native
trait SchemaSpecification extends js.Object {
  
  /**
    * An Android mobile test execution specification.
    */
  var androidTest: js.UndefOr[SchemaAndroidTest] = js.native
}
object SchemaSpecification {
  
  @scala.inline
  def apply(): SchemaSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpecification]
  }
  
  @scala.inline
  implicit class SchemaSpecificationOps[Self <: SchemaSpecification] (val x: Self) extends AnyVal {
    
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
    def setAndroidTest(value: SchemaAndroidTest): Self = this.set("androidTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidTest: Self = this.set("androidTest", js.undefined)
  }
}
