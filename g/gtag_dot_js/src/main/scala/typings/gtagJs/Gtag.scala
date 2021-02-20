package typings.gtagJs

import org.scalablytyped.runtime.StringDictionary
import typings.gtagJs.gtagJsStrings.config
import typings.gtagJs.gtagJsStrings.event
import typings.gtagJs.gtagJsStrings.js_
import typings.gtagJs.gtagJsStrings.set
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gtag {
  
  @js.native
  trait ControlParams extends StObject {
    
    var event_callback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var event_timeout: js.UndefOr[Double] = js.native
    
    var groups: js.UndefOr[String | js.Array[String]] = js.native
    
    var send_to: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ControlParams {
    
    @scala.inline
    def apply(): ControlParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlParams]
    }
    
    @scala.inline
    implicit class ControlParamsMutableBuilder[Self <: ControlParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent_callback(value: () => Unit): Self = StObject.set(x, "event_callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEvent_callbackUndefined: Self = StObject.set(x, "event_callback", js.undefined)
      
      @scala.inline
      def setEvent_timeout(value: Double): Self = StObject.set(x, "event_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent_timeoutUndefined: Self = StObject.set(x, "event_timeout", js.undefined)
      
      @scala.inline
      def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setSend_to(value: String | js.Array[String]): Self = StObject.set(x, "send_to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend_toUndefined: Self = StObject.set(x, "send_to", js.undefined)
      
      @scala.inline
      def setSend_toVarargs(value: String*): Self = StObject.set(x, "send_to", js.Array(value :_*))
    }
  }
  
  type Currency = String | Double
  
  type CustomParams = StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.gtagJs.gtagJsStrings.add_payment_info
    - typings.gtagJs.gtagJsStrings.add_to_cart
    - typings.gtagJs.gtagJsStrings.add_to_wishlist
    - typings.gtagJs.gtagJsStrings.begin_checkout
    - typings.gtagJs.gtagJsStrings.checkout_progress
    - typings.gtagJs.gtagJsStrings.exception
    - typings.gtagJs.gtagJsStrings.generate_lead
    - typings.gtagJs.gtagJsStrings.login
    - typings.gtagJs.gtagJsStrings.page_view
    - typings.gtagJs.gtagJsStrings.purchase
    - typings.gtagJs.gtagJsStrings.refund
    - typings.gtagJs.gtagJsStrings.remove_from_cart
    - typings.gtagJs.gtagJsStrings.screen_view
    - typings.gtagJs.gtagJsStrings.search
    - typings.gtagJs.gtagJsStrings.select_content
    - typings.gtagJs.gtagJsStrings.set_checkout_option
    - typings.gtagJs.gtagJsStrings.share
    - typings.gtagJs.gtagJsStrings.sign_up
    - typings.gtagJs.gtagJsStrings.timing_complete
    - typings.gtagJs.gtagJsStrings.view_item
    - typings.gtagJs.gtagJsStrings.view_item_list
    - typings.gtagJs.gtagJsStrings.view_promotion
    - typings.gtagJs.gtagJsStrings.view_search_results
  */
  trait EventNames extends StObject
  object EventNames {
    
    @scala.inline
    def add_payment_info: typings.gtagJs.gtagJsStrings.add_payment_info = "add_payment_info".asInstanceOf[typings.gtagJs.gtagJsStrings.add_payment_info]
    
    @scala.inline
    def add_to_cart: typings.gtagJs.gtagJsStrings.add_to_cart = "add_to_cart".asInstanceOf[typings.gtagJs.gtagJsStrings.add_to_cart]
    
    @scala.inline
    def add_to_wishlist: typings.gtagJs.gtagJsStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typings.gtagJs.gtagJsStrings.add_to_wishlist]
    
    @scala.inline
    def begin_checkout: typings.gtagJs.gtagJsStrings.begin_checkout = "begin_checkout".asInstanceOf[typings.gtagJs.gtagJsStrings.begin_checkout]
    
    @scala.inline
    def checkout_progress: typings.gtagJs.gtagJsStrings.checkout_progress = "checkout_progress".asInstanceOf[typings.gtagJs.gtagJsStrings.checkout_progress]
    
    @scala.inline
    def exception: typings.gtagJs.gtagJsStrings.exception = "exception".asInstanceOf[typings.gtagJs.gtagJsStrings.exception]
    
    @scala.inline
    def generate_lead: typings.gtagJs.gtagJsStrings.generate_lead = "generate_lead".asInstanceOf[typings.gtagJs.gtagJsStrings.generate_lead]
    
    @scala.inline
    def login: typings.gtagJs.gtagJsStrings.login = "login".asInstanceOf[typings.gtagJs.gtagJsStrings.login]
    
    @scala.inline
    def page_view: typings.gtagJs.gtagJsStrings.page_view = "page_view".asInstanceOf[typings.gtagJs.gtagJsStrings.page_view]
    
    @scala.inline
    def purchase: typings.gtagJs.gtagJsStrings.purchase = "purchase".asInstanceOf[typings.gtagJs.gtagJsStrings.purchase]
    
    @scala.inline
    def refund: typings.gtagJs.gtagJsStrings.refund = "refund".asInstanceOf[typings.gtagJs.gtagJsStrings.refund]
    
    @scala.inline
    def remove_from_cart: typings.gtagJs.gtagJsStrings.remove_from_cart = "remove_from_cart".asInstanceOf[typings.gtagJs.gtagJsStrings.remove_from_cart]
    
    @scala.inline
    def screen_view: typings.gtagJs.gtagJsStrings.screen_view = "screen_view".asInstanceOf[typings.gtagJs.gtagJsStrings.screen_view]
    
    @scala.inline
    def search: typings.gtagJs.gtagJsStrings.search = "search".asInstanceOf[typings.gtagJs.gtagJsStrings.search]
    
    @scala.inline
    def select_content: typings.gtagJs.gtagJsStrings.select_content = "select_content".asInstanceOf[typings.gtagJs.gtagJsStrings.select_content]
    
    @scala.inline
    def set_checkout_option: typings.gtagJs.gtagJsStrings.set_checkout_option = "set_checkout_option".asInstanceOf[typings.gtagJs.gtagJsStrings.set_checkout_option]
    
    @scala.inline
    def share: typings.gtagJs.gtagJsStrings.share = "share".asInstanceOf[typings.gtagJs.gtagJsStrings.share]
    
    @scala.inline
    def sign_up: typings.gtagJs.gtagJsStrings.sign_up = "sign_up".asInstanceOf[typings.gtagJs.gtagJsStrings.sign_up]
    
    @scala.inline
    def timing_complete: typings.gtagJs.gtagJsStrings.timing_complete = "timing_complete".asInstanceOf[typings.gtagJs.gtagJsStrings.timing_complete]
    
    @scala.inline
    def view_item: typings.gtagJs.gtagJsStrings.view_item = "view_item".asInstanceOf[typings.gtagJs.gtagJsStrings.view_item]
    
    @scala.inline
    def view_item_list: typings.gtagJs.gtagJsStrings.view_item_list = "view_item_list".asInstanceOf[typings.gtagJs.gtagJsStrings.view_item_list]
    
    @scala.inline
    def view_promotion: typings.gtagJs.gtagJsStrings.view_promotion = "view_promotion".asInstanceOf[typings.gtagJs.gtagJsStrings.view_promotion]
    
    @scala.inline
    def view_search_results: typings.gtagJs.gtagJsStrings.view_search_results = "view_search_results".asInstanceOf[typings.gtagJs.gtagJsStrings.view_search_results]
  }
  
  @js.native
  trait EventParams extends StObject {
    
    var checkout_option: js.UndefOr[String] = js.native
    
    var checkout_step: js.UndefOr[Double] = js.native
    
    var content_id: js.UndefOr[String] = js.native
    
    var content_type: js.UndefOr[String] = js.native
    
    var coupon: js.UndefOr[String] = js.native
    
    var currency: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var event_category: js.UndefOr[String] = js.native
    
    var event_label: js.UndefOr[String] = js.native
    
    var fatal: js.UndefOr[Boolean] = js.native
    
    var items: js.UndefOr[js.Array[Item]] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var number: js.UndefOr[String] = js.native
    
    var promotions: js.UndefOr[js.Array[Promotion]] = js.native
    
    var screen_name: js.UndefOr[String] = js.native
    
    var search_term: js.UndefOr[String] = js.native
    
    var shipping: js.UndefOr[Currency] = js.native
    
    var tax: js.UndefOr[Currency] = js.native
    
    var transaction_id: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object EventParams {
    
    @scala.inline
    def apply(): EventParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventParams]
    }
    
    @scala.inline
    implicit class EventParamsMutableBuilder[Self <: EventParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckout_option(value: String): Self = StObject.set(x, "checkout_option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckout_optionUndefined: Self = StObject.set(x, "checkout_option", js.undefined)
      
      @scala.inline
      def setCheckout_step(value: Double): Self = StObject.set(x, "checkout_step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckout_stepUndefined: Self = StObject.set(x, "checkout_step", js.undefined)
      
      @scala.inline
      def setContent_id(value: String): Self = StObject.set(x, "content_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_idUndefined: Self = StObject.set(x, "content_id", js.undefined)
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
      
      @scala.inline
      def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEvent_category(value: String): Self = StObject.set(x, "event_category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent_categoryUndefined: Self = StObject.set(x, "event_category", js.undefined)
      
      @scala.inline
      def setEvent_label(value: String): Self = StObject.set(x, "event_label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent_labelUndefined: Self = StObject.set(x, "event_label", js.undefined)
      
      @scala.inline
      def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setPromotions(value: js.Array[Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
      
      @scala.inline
      def setPromotionsVarargs(value: Promotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
      
      @scala.inline
      def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreen_nameUndefined: Self = StObject.set(x, "screen_name", js.undefined)
      
      @scala.inline
      def setSearch_term(value: String): Self = StObject.set(x, "search_term", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_termUndefined: Self = StObject.set(x, "search_term", js.undefined)
      
      @scala.inline
      def setShipping(value: Currency): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      @scala.inline
      def setTax(value: Currency): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
      
      @scala.inline
      def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Gtag extends StObject {
    
    def apply(command: config, targetId: String): Unit = js.native
    def apply(command: config, targetId: String, config: ControlParams): Unit = js.native
    def apply(command: config, targetId: String, config: CustomParams): Unit = js.native
    def apply(command: config, targetId: String, config: EventParams): Unit = js.native
    def apply(command: event, eventName: String): Unit = js.native
    def apply(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
    def apply(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
    def apply(command: event, eventName: String, eventParams: EventParams): Unit = js.native
    def apply(command: event, eventName: EventNames): Unit = js.native
    def apply(command: event, eventName: EventNames, eventParams: ControlParams): Unit = js.native
    def apply(command: event, eventName: EventNames, eventParams: CustomParams): Unit = js.native
    def apply(command: event, eventName: EventNames, eventParams: EventParams): Unit = js.native
    def apply(command: js_, config: Date): Unit = js.native
    def apply(command: set, config: CustomParams): Unit = js.native
  }
  
  @js.native
  trait Item extends StObject {
    
    var brand: js.UndefOr[String] = js.native
    
    var category: js.UndefOr[String] = js.native
    
    var creative_name: js.UndefOr[String] = js.native
    
    var creative_slot: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var location_id: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var price: js.UndefOr[Currency] = js.native
    
    var quantity: js.UndefOr[Double] = js.native
  }
  object Item {
    
    @scala.inline
    def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
      
      @scala.inline
      def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLocation_id(value: String): Self = StObject.set(x, "location_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation_idUndefined: Self = StObject.set(x, "location_id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrice(value: Currency): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    }
  }
  
  @js.native
  trait Promotion extends StObject {
    
    var creative_name: js.UndefOr[String] = js.native
    
    var creative_slot: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object Promotion {
    
    @scala.inline
    def apply(): Promotion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Promotion]
    }
    
    @scala.inline
    implicit class PromotionMutableBuilder[Self <: Promotion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
      
      @scala.inline
      def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
