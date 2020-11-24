package typings.jestValidate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-validate/build/condition", JSImport.Namespace)
@js.native
object conditionMod extends js.Object {
  
  def getValues[T](validOption: T): js.Array[T] = js.native
  
  def multipleValidOptions[T /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any = js.native
  
  def validationCondition(option: js.Any, validOption: js.Any): Boolean = js.native
}
