package typings.jestValidate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionMod {
  
  @JSImport("jest-validate/build/condition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getValues[T](validOption: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValues")(validOption.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def multipleValidOptions[T /* <: js.Array[js.Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleValidOptions")(args.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any]
  
  @scala.inline
  def validationCondition(option: js.Any, validOption: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validationCondition")(option.asInstanceOf[js.Any], validOption.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
