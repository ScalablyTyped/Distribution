package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEnum extends js.Object {
  
  def enum_i_query_suffix(vsuffix: String): Double = js.native
  
  def enum_pv_query(ve164: String): Double = js.native
  
  def enum_pv_query_suffix(ve164: String, vsuffix: String): Double = js.native
  
  def enum_pv_query_suffix_service(ve164: String, vsuffix: String, vservice: String): Double = js.native
  
  def enum_query(): Double = js.native
  
  def enum_query_suffix(vsuffix: String): Double = js.native
  
  def enum_query_suffix_service(vsuffix: String, vservice: String): Double = js.native
  
  def i_enum_query(): Double = js.native
  
  def i_enum_query_suffix_service(vsuffix: String, vservice: String): Double = js.native
  
  def is_from_user_enum(): Double = js.native
  
  def is_from_user_enum_suffix(vsuffix: String): Double = js.native
  
  def is_from_user_enum_suffix_service(vsuffix: String, vservice: String): Double = js.native
}
object TypeofEnum {
  
  @scala.inline
  def apply(
    enum_i_query_suffix: String => Double,
    enum_pv_query: String => Double,
    enum_pv_query_suffix: (String, String) => Double,
    enum_pv_query_suffix_service: (String, String, String) => Double,
    enum_query: () => Double,
    enum_query_suffix: String => Double,
    enum_query_suffix_service: (String, String) => Double,
    i_enum_query: () => Double,
    i_enum_query_suffix_service: (String, String) => Double,
    is_from_user_enum: () => Double,
    is_from_user_enum_suffix: String => Double,
    is_from_user_enum_suffix_service: (String, String) => Double
  ): TypeofEnum = {
    val __obj = js.Dynamic.literal(enum_i_query_suffix = js.Any.fromFunction1(enum_i_query_suffix), enum_pv_query = js.Any.fromFunction1(enum_pv_query), enum_pv_query_suffix = js.Any.fromFunction2(enum_pv_query_suffix), enum_pv_query_suffix_service = js.Any.fromFunction3(enum_pv_query_suffix_service), enum_query = js.Any.fromFunction0(enum_query), enum_query_suffix = js.Any.fromFunction1(enum_query_suffix), enum_query_suffix_service = js.Any.fromFunction2(enum_query_suffix_service), i_enum_query = js.Any.fromFunction0(i_enum_query), i_enum_query_suffix_service = js.Any.fromFunction2(i_enum_query_suffix_service), is_from_user_enum = js.Any.fromFunction0(is_from_user_enum), is_from_user_enum_suffix = js.Any.fromFunction1(is_from_user_enum_suffix), is_from_user_enum_suffix_service = js.Any.fromFunction2(is_from_user_enum_suffix_service))
    __obj.asInstanceOf[TypeofEnum]
  }
  
  @scala.inline
  implicit class TypeofEnumOps[Self <: TypeofEnum] (val x: Self) extends AnyVal {
    
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
    def setEnum_i_query_suffix(value: String => Double): Self = this.set("enum_i_query_suffix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnum_pv_query(value: String => Double): Self = this.set("enum_pv_query", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnum_pv_query_suffix(value: (String, String) => Double): Self = this.set("enum_pv_query_suffix", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnum_pv_query_suffix_service(value: (String, String, String) => Double): Self = this.set("enum_pv_query_suffix_service", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnum_query(value: () => Double): Self = this.set("enum_query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnum_query_suffix(value: String => Double): Self = this.set("enum_query_suffix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnum_query_suffix_service(value: (String, String) => Double): Self = this.set("enum_query_suffix_service", js.Any.fromFunction2(value))
    
    @scala.inline
    def setI_enum_query(value: () => Double): Self = this.set("i_enum_query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setI_enum_query_suffix_service(value: (String, String) => Double): Self = this.set("i_enum_query_suffix_service", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIs_from_user_enum(value: () => Double): Self = this.set("is_from_user_enum", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIs_from_user_enum_suffix(value: String => Double): Self = this.set("is_from_user_enum_suffix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIs_from_user_enum_suffix_service(value: (String, String) => Double): Self = this.set("is_from_user_enum_suffix_service", js.Any.fromFunction2(value))
  }
}
