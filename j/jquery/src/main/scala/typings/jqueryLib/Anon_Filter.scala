package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Filter extends js.Object {
  /**
           * jQuery calls this function after it constructs the `jQuery.Event` object, copies standard properties from `jQuery.event.props`, and copies the `fixHooks`-specific props (if any) specified above. The function can create new properties on the event object or modify existing ones. The second argument is the browser's native event object, which is also available in `event.originalEvent`.
           *
           * Note that for all events, the browser's native event object is available in `event.originalEvent`; if the jQuery event handler examines the properties there instead of jQuery's normalized `event` object, there is no need to create a `fixHooks` entry to copy or modify the properties.
           * @example ​ ````For example, to set a hook for the "drop" event that copies the `dataTransfer` property, assign an object to `jQuery.event.fixHooks.drop`:
  ```javascript
  jQuery.event.fixHooks.drop = {
      props: [ "dataTransfer" ]
  };
  ```
  
  Since fixHooks is an advanced feature and rarely used externally, jQuery does not include code or
  interfaces to deal with conflict resolution. If there is a chance that some other code may be assigning
  `fixHooks` to the same events, the code should check for an existing hook and take appropriate measures.
  A simple solution might look like this:
  
  ```javascript
  if ( jQuery.event.fixHooks.drop ) {
      throw new Error( "Someone else took the jQuery.event.fixHooks.drop hook!" );
  }
  
  jQuery.event.fixHooks.drop = {
      props: [ "dataTransfer" ]
  };
  ```
  
  When there are known cases of different plugins wanting to attach to the drop hook, this solution might be more appropriate:
  
  ```javascript
  var existingHook = jQuery.event.fixHooks.drop;
  
  if ( !existingHook ) {
      jQuery.event.fixHooks.drop = {
          props: [ "dataTransfer" ]
      };
  } else {
      if ( existingHook.props ) {
          existingHook.props.push( "dataTransfer" );
      } else {
          existingHook.props = [ "dataTransfer" ];
      }
  }
  ```
           */
  def filter(event: jqueryLib.JQueryNs.Event[stdLib.EventTarget, scala.Null], originalEvent: _Event): scala.Unit
}

