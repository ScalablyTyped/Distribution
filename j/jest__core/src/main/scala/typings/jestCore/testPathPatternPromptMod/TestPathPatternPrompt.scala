package typings.jestCore.testPathPatternPromptMod

import typings.jestRunner.mod.Test
import typings.std.ScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PatternPrompt * / any */ trait TestPathPatternPrompt extends js.Object {
  var _searchSources: js.UndefOr[SearchSources] = js.undefined
  def _getMatchedTests(pattern: String): js.Array[Test]
  def _onChange(pattern: String, options: ScrollOptions): Unit
  def _printPrompt(pattern: String): Unit
  def updateSearchSources(searchSources: SearchSources): Unit
}

object TestPathPatternPrompt {
  @scala.inline
  def apply(
    _getMatchedTests: String => js.Array[Test],
    _onChange: (String, ScrollOptions) => Unit,
    _printPrompt: String => Unit,
    updateSearchSources: SearchSources => Unit,
    _searchSources: SearchSources = null
  ): TestPathPatternPrompt = {
    val __obj = js.Dynamic.literal(_getMatchedTests = js.Any.fromFunction1(_getMatchedTests), _onChange = js.Any.fromFunction2(_onChange), _printPrompt = js.Any.fromFunction1(_printPrompt), updateSearchSources = js.Any.fromFunction1(updateSearchSources))
    if (_searchSources != null) __obj.updateDynamic("_searchSources")(_searchSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPathPatternPrompt]
  }
}

