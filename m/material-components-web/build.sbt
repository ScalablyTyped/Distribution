organization := "org.scalablytyped"
name := "material-components-web"
version := "3.2.0-96991c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-469589",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-f5468b",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20191126Z-c490da",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20191126Z-6f73a6",
  "org.scalablytyped" %%% "material__data-table" % "3.2.0-519f8f",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20191126Z-9beab3",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20191126Z-d8fef4",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-8f0414",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20191126Z-36ff10",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20191126Z-bca727",
  "org.scalablytyped" %%% "material__icon-button" % "3.2.0-ee89b3",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-e66466",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20191126Z-c001cf",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20191126Z-f18943",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20191126Z-7e88f9",
  "org.scalablytyped" %%% "material__menu-surface" % "3.2.0-dfe629",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-ed4e6e",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20191126Z-3f5235",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-056815",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20191126Z-f6929e",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-4b0251",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20191126Z-6c144e",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20191126Z-f2526b",
  "org.scalablytyped" %%% "material__switch" % "3.2.0-a20491",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20191126Z-abb681",
  "org.scalablytyped" %%% "material__tab-bar" % "3.2.0-15c34f",
  "org.scalablytyped" %%% "material__tab-indicator" % "3.1.0-343b62",
  "org.scalablytyped" %%% "material__tab-scroller" % "3.2.0-4e09c3",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20191126Z-42bb4d",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20191126Z-2955f5",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
