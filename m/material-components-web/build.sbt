organization := "org.scalablytyped"
name := "material-components-web"
version := "5.1.0-ffc3e1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-657c76",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-7fb16a",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20191126Z-486558",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20191126Z-0352f8",
  "org.scalablytyped" %%% "material__data-table" % "5.1.0-5931b5",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20191126Z-2957e3",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20191126Z-54f61f",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-6c49a7",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20191126Z-8ae037",
  "org.scalablytyped" %%% "material__icon-button" % "5.1.0-456ba4",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-232cdd",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20191126Z-107270",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20191126Z-331ab0",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20191126Z-97b6ba",
  "org.scalablytyped" %%% "material__menu-surface" % "5.1.0-c0ae85",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-160096",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20191126Z-695f16",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-840f82",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20191126Z-c2caf2",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-1a51de",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20191126Z-9bde73",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20191126Z-812322",
  "org.scalablytyped" %%% "material__switch" % "5.1.0-56fcfc",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20191126Z-2cf044",
  "org.scalablytyped" %%% "material__tab-bar" % "5.1.0-9c8c84",
  "org.scalablytyped" %%% "material__tab-indicator" % "5.1.0-ef003b",
  "org.scalablytyped" %%% "material__tab-scroller" % "5.1.0-8c3f69",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20191126Z-deaee5",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20191126Z-e29bdc",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
