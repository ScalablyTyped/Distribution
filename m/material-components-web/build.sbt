organization := "org.scalablytyped"
name := "material-components-web"
version := "5.1.0-8be6ed"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-767757",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-bcd36c",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20191126Z-a7dbb6",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20191126Z-f6fb26",
  "org.scalablytyped" %%% "material__data-table" % "5.1.0-3efb5f",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20191126Z-544dd2",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20191126Z-17318b",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-de0198",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20191126Z-4433e4",
  "org.scalablytyped" %%% "material__icon-button" % "5.1.0-8e5464",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-fe66fe",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20191126Z-e73919",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20191126Z-94f3a7",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20191126Z-876373",
  "org.scalablytyped" %%% "material__menu-surface" % "5.1.0-7eff4f",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-5ce0fd",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20191126Z-5ba0d4",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-249f07",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20191126Z-55d251",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-e33cc7",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20191126Z-62f207",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20191126Z-9cb583",
  "org.scalablytyped" %%% "material__switch" % "5.1.0-b755fa",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20191126Z-5516a3",
  "org.scalablytyped" %%% "material__tab-bar" % "5.1.0-4b8ba4",
  "org.scalablytyped" %%% "material__tab-indicator" % "5.1.0-0d46e5",
  "org.scalablytyped" %%% "material__tab-scroller" % "5.1.0-c6c672",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20191126Z-97403e",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20191126Z-b2db1d",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
