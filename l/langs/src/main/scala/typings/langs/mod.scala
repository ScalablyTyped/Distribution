package typings.langs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("langs", JSImport.Namespace)
  @js.native
  val ^ : Langs = js.native
  
  @js.native
  trait Langs extends StObject {
    
    def all(): js.Array[Language] = js.native
    
    def codes(`type`: Type): js.Array[String] = js.native
    
    def has(`type`: Type, `val`: String): Boolean = js.native
    
    def names(): js.Array[String] = js.native
    def names(local: Boolean): js.Array[String] = js.native
    
    def where(`type`: Type, `val`: String): js.UndefOr[Language] = js.native
  }
  
  trait Language extends StObject {
    
    var `1`: String
    
    var `2`: String
    
    var `2B`: String
    
    var `2T`: String
    
    var `3`: String
    
    var local: String
    
    var name: String
  }
  object Language {
    
    inline def apply(`1`: String, `2`: String, `2B`: String, `2T`: String, `3`: String, local: String, name: String): Language = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("2B")(`2B`.asInstanceOf[js.Any])
      __obj.updateDynamic("2T")(`2T`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set2B(value: String): Self = StObject.set(x, "2B", value.asInstanceOf[js.Any])
      
      inline def set2T(value: String): Self = StObject.set(x, "2T", value.asInstanceOf[js.Any])
      
      inline def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.langs.langsInts.`1`
    - typings.langs.langsInts.`2`
    - typings.langs.langsInts.`3`
    - typings.langs.langsStrings.`1`
    - typings.langs.langsStrings.`2`
    - typings.langs.langsStrings.`2T`
    - typings.langs.langsStrings.`2B`
    - typings.langs.langsStrings.`3`
  */
  trait Type extends StObject
  object Type {
    
    inline def `1`: typings.langs.langsInts.`1` = 1.asInstanceOf[typings.langs.langsInts.`1`]
    
    inline def `2`: typings.langs.langsInts.`2` = 2.asInstanceOf[typings.langs.langsInts.`2`]
    
    inline def `2B`: typings.langs.langsStrings.`2B` = "2B".asInstanceOf[typings.langs.langsStrings.`2B`]
    
    inline def `2T`: typings.langs.langsStrings.`2T` = "2T".asInstanceOf[typings.langs.langsStrings.`2T`]
    
    inline def `3`: typings.langs.langsInts.`3` = 3.asInstanceOf[typings.langs.langsInts.`3`]
  }
  
  type _To = Langs
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Langs = ^
}
