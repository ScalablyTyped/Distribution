package typings.istanbulLibCoverage.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCoverageData extends js.Object {
  
  var b: StringDictionary[js.Array[Double]] = js.native
  
  var branchMap: StringDictionary[BranchMapping] = js.native
  
  var f: StringDictionary[Double] = js.native
  
  var fnMap: StringDictionary[FunctionMapping] = js.native
  
  var path: String = js.native
  
  var s: StringDictionary[Double] = js.native
  
  var statementMap: StringDictionary[Range] = js.native
}
object FileCoverageData {
  
  @scala.inline
  def apply(
    b: StringDictionary[js.Array[Double]],
    branchMap: StringDictionary[BranchMapping],
    f: StringDictionary[Double],
    fnMap: StringDictionary[FunctionMapping],
    path: String,
    s: StringDictionary[Double],
    statementMap: StringDictionary[Range]
  ): FileCoverageData = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], branchMap = branchMap.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], fnMap = fnMap.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], statementMap = statementMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCoverageData]
  }
  
  @scala.inline
  implicit class FileCoverageDataOps[Self <: FileCoverageData] (val x: Self) extends AnyVal {
    
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
    def setB(value: StringDictionary[js.Array[Double]]): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchMap(value: StringDictionary[BranchMapping]): Self = this.set("branchMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: StringDictionary[Double]): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFnMap(value: StringDictionary[FunctionMapping]): Self = this.set("fnMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: StringDictionary[Double]): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementMap(value: StringDictionary[Range]): Self = this.set("statementMap", value.asInstanceOf[js.Any])
  }
}
