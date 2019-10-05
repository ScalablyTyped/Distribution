organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-d1379f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-437e80",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-924dab",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-9e564f",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-ffb5d7",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-073735",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-68f48b",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-1d2d63",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-a7042c",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-d64605",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-d24aee",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-b02251",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-d18302",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-7291cb",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-9bc600",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-260203",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-47758c",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-43c42e",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-cadeb2",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-06bd65",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-83abb4",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-008f21",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-b7ea80",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-a6f4ba",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-e7789b",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-616139",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        