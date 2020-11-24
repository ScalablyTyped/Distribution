package typings.jestCore.anon

import typings.jestCore.jestCoreStrings.roots
import typings.jestCore.jestCoreStrings.testMatch
import typings.jestCore.jestCoreStrings.testPathIgnorePatterns
import typings.jestCore.jestCoreStrings.testPathPattern
import typings.jestCore.jestCoreStrings.testRegex
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsMatch extends js.Object {
  
  def isMatch(path: Path): Boolean = js.native
  
  var stat: /* keyof @jest/core.@jest/core/build/types.Stats */ roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern = js.native
}
object IsMatch {
  
  @scala.inline
  def apply(
    isMatch: Path => Boolean,
    stat: /* keyof @jest/core.@jest/core/build/types.Stats */ roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern
  ): IsMatch = {
    val __obj = js.Dynamic.literal(isMatch = js.Any.fromFunction1(isMatch), stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMatch]
  }
  
  @scala.inline
  implicit class IsMatchOps[Self <: IsMatch] (val x: Self) extends AnyVal {
    
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
    def setIsMatch(value: Path => Boolean): Self = this.set("isMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStat(
      value: /* keyof @jest/core.@jest/core/build/types.Stats */ roots | testMatch | testPathIgnorePatterns | testRegex | testPathPattern
    ): Self = this.set("stat", value.asInstanceOf[js.Any])
  }
}
