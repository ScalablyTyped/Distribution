package typings.grunt.minimatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A minimal matching utility options.
  *
  * This is the matching library used internally by npm.
  * Eventually, it will replace the C binding in node-glob.
  * It works by converting glob expressions into JavaScript RegExp objects.
  */
@js.native
trait IMinimatchOptions extends js.Object {
  
  /*
    All options are false by default.
    */
  /**
    * Dump a ton of stuff to stderr.
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow patterns to match filenames starting with a period,
    * even if the pattern does not explicitly have a period in that spot.
    */
  // Note that by default, a/**\/b will not match a/.d/b, unless dot is set.
  var dot: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns from negate expressions the same as if they were not negated. (Ie, true on a hit, false on a miss.)
    */
  var flipNegate: js.UndefOr[Boolean] = js.native
  
  /**
    * If set, then patterns without slashes will be matched against the basename of the path if it contains slashes.
    * For example, a?b would match the path /xyz/123/acb, but not /xyz/acb/123.
    */
  var matchBase: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not expand {a,b} and {1..3} brace sets.
    */
  var nobrace: js.UndefOr[Boolean] = js.native
  
  /**
    * Perform a case-insensitive match.
    */
  var nocase: js.UndefOr[Boolean] = js.native
  
  /**
    * Suppress the behavior of treating # at the start of a pattern as a comment.
    */
  var nocomment: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable "extglob" style patterns like +(a|b).
    */
  var noext: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable ** matching against multiple folder names.
    */
  var noglobstar: js.UndefOr[Boolean] = js.native
  
  /**
    * Suppress the behavior of treating a leading ! character as negation.
    */
  var nonegate: js.UndefOr[Boolean] = js.native
  
  /**
    * When a match is not found by minimatch.match, return a list containing the pattern itself.
    * When set, an empty list is returned if there are no matches.
    */
  var nonull: js.UndefOr[Boolean] = js.native
}
object IMinimatchOptions {
  
  @scala.inline
  def apply(): IMinimatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMinimatchOptions]
  }
  
  @scala.inline
  implicit class IMinimatchOptionsOps[Self <: IMinimatchOptions] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setFlipNegate(value: Boolean): Self = this.set("flipNegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipNegate: Self = this.set("flipNegate", js.undefined)
    
    @scala.inline
    def setMatchBase(value: Boolean): Self = this.set("matchBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBase: Self = this.set("matchBase", js.undefined)
    
    @scala.inline
    def setNobrace(value: Boolean): Self = this.set("nobrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNobrace: Self = this.set("nobrace", js.undefined)
    
    @scala.inline
    def setNocase(value: Boolean): Self = this.set("nocase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocase: Self = this.set("nocase", js.undefined)
    
    @scala.inline
    def setNocomment(value: Boolean): Self = this.set("nocomment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocomment: Self = this.set("nocomment", js.undefined)
    
    @scala.inline
    def setNoext(value: Boolean): Self = this.set("noext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoext: Self = this.set("noext", js.undefined)
    
    @scala.inline
    def setNoglobstar(value: Boolean): Self = this.set("noglobstar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoglobstar: Self = this.set("noglobstar", js.undefined)
    
    @scala.inline
    def setNonegate(value: Boolean): Self = this.set("nonegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonegate: Self = this.set("nonegate", js.undefined)
    
    @scala.inline
    def setNonull(value: Boolean): Self = this.set("nonull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonull: Self = this.set("nonull", js.undefined)
  }
}
