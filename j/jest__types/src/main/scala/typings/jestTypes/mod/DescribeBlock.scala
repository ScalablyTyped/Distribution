package typings.jestTypes.mod

import typings.jestTypes.jestTypesStrings.describeBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBlock extends StObject {
  
  var children: js.Array[DescribeBlock | TestEntry]
  
  var hooks: js.Array[Hook]
  
  var mode: BlockMode
  
  var name: BlockName2
  
  var parent: js.UndefOr[DescribeBlock] = js.undefined
  
  /** @deprecated Please get from `children` array instead */
  var tests: js.Array[TestEntry]
  
  var `type`: describeBlock
}
object DescribeBlock {
  
  inline def apply(
    children: js.Array[DescribeBlock | TestEntry],
    hooks: js.Array[Hook],
    mode: BlockMode,
    name: BlockName2,
    tests: js.Array[TestEntry]
  ): DescribeBlock = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("describeBlock")
    __obj.asInstanceOf[DescribeBlock]
  }
  
  extension [Self <: DescribeBlock](x: Self) {
    
    inline def setChildren(value: js.Array[DescribeBlock | TestEntry]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (DescribeBlock | TestEntry)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHooks(value: js.Array[Hook]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksVarargs(value: Hook*): Self = StObject.set(x, "hooks", js.Array(value*))
    
    inline def setMode(value: BlockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: BlockName2): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DescribeBlock): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTests(value: js.Array[TestEntry]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsVarargs(value: TestEntry*): Self = StObject.set(x, "tests", js.Array(value*))
    
    inline def setType(value: describeBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
