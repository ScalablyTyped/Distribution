package typings.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flags extends js.Object {
  
  /**
    * Metadata about the found package.
    */
  @JSName("package")
  var _package: Date = js.native
  
  /**
    * Flags about the package.
    */
  var flags: Insecure = js.native
  
  /**
    * Object detailing the normalized search score.
    */
  var score: Detail = js.native
  
  /**
    * The search score.
    */
  var searchScore: Double = js.native
}
object Flags {
  
  @scala.inline
  def apply(_package: Date, flags: Insecure, score: Detail, searchScore: Double): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
    
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
    def set_package(value: Date): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Insecure): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Detail): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchScore(value: Double): Self = this.set("searchScore", value.asInstanceOf[js.Any])
  }
}
