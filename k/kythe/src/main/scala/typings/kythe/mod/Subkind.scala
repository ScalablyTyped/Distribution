package typings.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Subkind extends StObject
@JSImport("kythe", "Subkind")
@js.native
object Subkind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Subkind with String] = js.native
  
  @js.native
  sealed trait CATEGORY extends Subkind
  /* "category" */ val CATEGORY: typings.kythe.mod.Subkind.CATEGORY with String = js.native
  
  @js.native
  sealed trait CLASS extends Subkind
  /* "class" */ val CLASS: typings.kythe.mod.Subkind.CLASS with String = js.native
  
  @js.native
  sealed trait CONSTRUCTOR extends Subkind
  /* "constructor" */ val CONSTRUCTOR: typings.kythe.mod.Subkind.CONSTRUCTOR with String = js.native
  
  @js.native
  sealed trait DESTRUCTOR extends Subkind
  /* "destructor" */ val DESTRUCTOR: typings.kythe.mod.Subkind.DESTRUCTOR with String = js.native
  
  @js.native
  sealed trait ENUM extends Subkind
  /* "enum" */ val ENUM: typings.kythe.mod.Subkind.ENUM with String = js.native
  
  @js.native
  sealed trait ENUM_CLASS extends Subkind
  /* "enumClass" */ val ENUM_CLASS: typings.kythe.mod.Subkind.ENUM_CLASS with String = js.native
  
  @js.native
  sealed trait FIELD extends Subkind
  /* "field" */ val FIELD: typings.kythe.mod.Subkind.FIELD with String = js.native
  
  @js.native
  sealed trait IMPLICIT extends Subkind
  /* "implicit" */ val IMPLICIT: typings.kythe.mod.Subkind.IMPLICIT with String = js.native
  
  @js.native
  sealed trait IMPORT extends Subkind
  /* "import" */ val IMPORT: typings.kythe.mod.Subkind.IMPORT with String = js.native
  
  @js.native
  sealed trait INITIALIZER extends Subkind
  /* "initializer" */ val INITIALIZER: typings.kythe.mod.Subkind.INITIALIZER with String = js.native
  
  @js.native
  sealed trait LOCAL extends Subkind
  /* "local" */ val LOCAL: typings.kythe.mod.Subkind.LOCAL with String = js.native
  
  @js.native
  sealed trait LOCAL_PARAMETER extends Subkind
  /* "local/parameter" */ val LOCAL_PARAMETER: typings.kythe.mod.Subkind.LOCAL_PARAMETER with String = js.native
  
  @js.native
  sealed trait METHOD extends Subkind
  /* "method" */ val METHOD: typings.kythe.mod.Subkind.METHOD with String = js.native
  
  @js.native
  sealed trait NAMESPACE extends Subkind
  /* "namespace" */ val NAMESPACE: typings.kythe.mod.Subkind.NAMESPACE with String = js.native
  
  @js.native
  sealed trait STRUCT extends Subkind
  /* "struct" */ val STRUCT: typings.kythe.mod.Subkind.STRUCT with String = js.native
  
  @js.native
  sealed trait TYPE extends Subkind
  /* "type" */ val TYPE: typings.kythe.mod.Subkind.TYPE with String = js.native
  
  @js.native
  sealed trait UNION extends Subkind
  /* "union" */ val UNION: typings.kythe.mod.Subkind.UNION with String = js.native
}
