package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListRouteView extends RouteView {
  def addCollapsibleSection(options: SectionDescriptor): CollapsibleSectionView
  // addCollapsibleSection(options: Stream<SectionDescriptor>): CollapsibleSectionView;
  def addSection(options: SectionDescriptor): SectionView
  // addSection(options: Stream<SectionDescriptor>): SectionView;
  def refresh(): scala.Unit
}

