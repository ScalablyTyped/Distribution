organization := "org.scalablytyped"
name := "jupyterlab__celltags"
version := "2.1.0-0a9b91"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "free-style" % "3.1.0-742fcb",
  "org.scalablytyped" %%% "jupyterlab__application" % "2.1.0-4a3750",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "2.1.0-35482a",
  "org.scalablytyped" %%% "jupyterlab__attachments" % "2.1.0-955f47",
  "org.scalablytyped" %%% "jupyterlab__cells" % "2.1.0-b7d97c",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "2.1.0-84bcca",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "4.1.0-f7dbe8",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "2.1.0-503dbb",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "2.1.0-3d8433",
  "org.scalablytyped" %%% "jupyterlab__notebook" % "2.1.0-9e77ee",
  "org.scalablytyped" %%% "jupyterlab__observables" % "3.1.0-730b6a",
  "org.scalablytyped" %%% "jupyterlab__outputarea" % "2.1.0-f1396e",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "2.1.0-d11bd9",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "2.1.0-6d2885",
  "org.scalablytyped" %%% "jupyterlab__services" % "5.1.0-ff30db",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "2.1.0-159859",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.1.0-7d8b84",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "2.1.0-947004",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-20681f",
  "org.scalablytyped" %%% "lumino__application" % "1.8.4-c0e364",
  "org.scalablytyped" %%% "lumino__commands" % "1.10.1-c3d523",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.2-769091",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.5-4f5e15",
  "org.scalablytyped" %%% "lumino__messaging" % "1.3.3-e98446",
  "org.scalablytyped" %%% "lumino__polling" % "1.1.1-d69181",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.5-4057d2",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.6.1-2aab2c",
  "org.scalablytyped" %%% "lumino__widgets" % "1.11.1-b1d647",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "typestyle" % "2.1.0-f63237")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
