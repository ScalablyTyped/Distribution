package typings.jestTypes.circusMod

import typings.jestTypes.jestTypesStrings.describeBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBlock extends js.Object {
  
  var children: js.Array[DescribeBlock | TestEntry] = js.native
  
  var hooks: js.Array[Hook] = js.native
  
  var mode: BlockMode = js.native
  
  var name: BlockName = js.native
  
  var parent: js.UndefOr[DescribeBlock] = js.native
  
  /** @deprecated Please get from `children` array instead */
  var tests: js.Array[TestEntry] = js.native
  
  var `type`: describeBlock = js.native
}
object DescribeBlock {
  
  @scala.inline
  def apply(
    children: js.Array[DescribeBlock | TestEntry],
    hooks: js.Array[Hook],
    mode: BlockMode,
    name: BlockName,
    tests: js.Array[TestEntry],
    `type`: describeBlock
  ): DescribeBlock = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlock]
  }
  
  @scala.inline
  implicit class DescribeBlockOps[Self <: DescribeBlock] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: (DescribeBlock | TestEntry)*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[DescribeBlock | TestEntry]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksVarargs(value: Hook*): Self = this.set("hooks", js.Array(value :_*))
    
    @scala.inline
    def setHooks(value: js.Array[Hook]): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: BlockMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: BlockName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsVarargs(value: TestEntry*): Self = this.set("tests", js.Array(value :_*))
    
    @scala.inline
    def setTests(value: js.Array[TestEntry]): Self = this.set("tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: describeBlock): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: DescribeBlock): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
