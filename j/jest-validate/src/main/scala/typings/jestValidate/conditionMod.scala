package typings.jestValidate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionMod {
  
  @JSImport("jest-validate/build/condition", "getValues")
  @js.native
  def getValues[T](validOption: T): js.Array[T] = js.native
  
  @JSImport("jest-validate/build/condition", "multipleValidOptions")
  @js.native
  def multipleValidOptions[T /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any = js.native
  
  @JSImport("jest-validate/build/condition", "validationCondition")
  @js.native
  def validationCondition(option: js.Any, validOption: js.Any): Boolean = js.native
}
